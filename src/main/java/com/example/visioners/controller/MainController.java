package com.example.visioners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/main")
    public String showMainPage() {
        return "main"; // templates 디렉토리 내의 main.html을 렌더링합니다.
    }
    @GetMapping("/cameramain")
    public String showCameraPage() {
        return "cameramain"; // templates 디렉토리 내의 cameramain.html을 렌더링합니다.
    }
    @GetMapping("/domestic")
    public String showDomesticPage() {
        return "domestic"; // templates 디렉토리 내의 domestic.html을 렌더링합니다.
    }
    @GetMapping("/international")
    public String showInternationalPage() {
        return "international"; //
    }
    @GetMapping("/service")
    public String showServicelPage() {
        return "service"; //
    }
    @GetMapping("/hongmin")
    public String showHongminPage() {
        return "hongmin"; //
    }
    @GetMapping("/hyojin")
    public String showHyojinPage() {
        return "hyojin"; //
    }
    @GetMapping("/seonae")
    public String showSeonaePage() {
        return "seonae"; //
    }
    @GetMapping("/yoobin")
    public String showYoobinPage() {
        return "yoobin"; //
    }
    @GetMapping("/noticeboard")
    public String showNoticeBoardPage() {
        return "noticeboard"; //
    }

    @GetMapping("/success")
    public ModelAndView success() {
        return new ModelAndView("success"); // "success.html"이라는 뷰를 반환하도록 설정
    }
}

