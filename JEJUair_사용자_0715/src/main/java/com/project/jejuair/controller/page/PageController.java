package com.project.jejuair.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    @RequestMapping("")   //http://localhost:8090/
    public class PageController {

        @RequestMapping("/admin")
        public ModelAndView admin_index(){
            return new ModelAndView("/admin/pages/index");
        }

//        화면 테스트용 코드


//        은비 테스트
        @RequestMapping("/admin_settings/admin_edit")
        public ModelAndView admin_settings(){
            return new ModelAndView("/admin/pages/admin_settings/admin_list/admin_edit");
        }

        @RequestMapping("/admin_settings/admin_list")
        public ModelAndView admin_list(){
            return new ModelAndView("/admin/pages/admin_settings/admin_list/admin_list");
        }

        @RequestMapping("/admin_settings/admin_view")
        public ModelAndView admin_view(){
            return new ModelAndView("/admin/pages/admin_settings/admin_list/admin_view");
        }

        @RequestMapping("/admin_settings/admin_regist")
        public ModelAndView admin_regist(){
            return new ModelAndView("/admin/pages/admin_settings/admin_regist/admin_regist");
        }

        @RequestMapping("/airline_food/airline_food_edit")
        public ModelAndView airline_food_edit(){
            return new ModelAndView("/admin/pages/airline_food/airline_food_list/airline_food_edit");
        }

        @RequestMapping("/airline_food/airline_food_list")
        public ModelAndView airline_food_list(){
            return new ModelAndView("/admin/pages/airline_food/airline_food_list/airline_food_list");
        }

        @RequestMapping("/airline_food/airline_food_view")
        public ModelAndView airline_food_view(){
            return new ModelAndView("/admin/pages/airline_food/airline_food_list/airline_food_view");
        }

        @RequestMapping("/airline_food/airline_food_regist")
        public ModelAndView airline_food_regist(){
            return new ModelAndView("/admin/pages/airline_food/airline_food_register/airline_food_regist");
        }

        @RequestMapping("/coupon/coupon_detail")
        public ModelAndView coupon_detail(){
            return new ModelAndView("/admin/pages/coupon/coupon_list/coupon_detail");
        }

        @RequestMapping("/coupon/coupon_edit")
        public ModelAndView coupon_edit(){
            return new ModelAndView("/admin/pages/coupon/coupon_list/coupon_edit");
        }

        @RequestMapping("/coupon/coupon_list")
        public ModelAndView coupon_list(){
            return new ModelAndView("/admin/pages/coupon/coupon_list/coupon_list");
        }

        @RequestMapping("/coupon/coupon_used_list")
        public ModelAndView coupon_used_list(){
            return new ModelAndView("/admin/pages/coupon/coupon_list/coupon_used_list");
        }

        @RequestMapping("/coupon/coupon_reg")
        public ModelAndView coupon_reg(){
            return new ModelAndView("/admin/pages/coupon/coupon_regist/coupon_reg");
        }

        @RequestMapping("/customer/customer_info")
        public ModelAndView customer_info(){
            return new ModelAndView("/admin/pages/customer/customer_list/customer_info");
        }

        @RequestMapping("/customer/customer_info_modify")
        public ModelAndView customer_info_modify(){
            return new ModelAndView("/admin/pages/customer/customer_list/customer_info_modify");
        }

        @RequestMapping("/customer/customer_list")
        public ModelAndView customer_list(){
            return new ModelAndView("/admin/pages/customer/customer_list/customer_list");
        }

//        우재 테스트

//        응수 테스트

        @RequestMapping("/user")
        public ModelAndView user_index(){
            return new ModelAndView("/user/pages/index");
        }

        @RequestMapping("/user/login")
        public ModelAndView user_login(){
            return new ModelAndView("/user/pages/login/login");
        }



    }
