package techsuppDev.techsupp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyPageController {

    @GetMapping("/edituser") // modelandview 모델을 뷰에 던져준다는 개념임.
    public ModelAndView editUser() {
        ModelAndView mav = new ModelAndView("mypage/editUser");
        return mav;
    }




}
