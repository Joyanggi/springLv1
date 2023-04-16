package com.sparta.hanghaememo.controller;


import com.sparta.hanghaememo.dto.MemoRequestDto;
import com.sparta.hanghaememo.dto.ResponseDto;
import com.sparta.hanghaememo.entity.Memo;
import com.sparta.hanghaememo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        return memoService.createMemo(requestDto);
    }

    @GetMapping("/api/memos")
    public List<Memo> getMemos() {
        return memoService.getMemos();
    }

    @GetMapping("/api/memos/{id}")
    public ResponseDto<?> getMemosId(@PathVariable Long id) {
        return memoService.getMemosId(id);
    }

    @PutMapping("/api/memos/{id}")
    public ResponseDto<?> updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.update(id, requestDto);
    }

    @DeleteMapping("/api/memos/{id}")
    public ResponseDto<?> deleteMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.deleteMemo(id, requestDto);
    }

}