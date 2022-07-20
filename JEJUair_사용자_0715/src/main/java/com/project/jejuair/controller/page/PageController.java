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

        @RequestMapping("/coupon/coupon_reg") //오류남
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

//        우재 테스트 http://localhost:10000/mainpage_settings

        // http://localhost:10000/mainpage_settings/recommended_flight_edit
        @RequestMapping("/mainpage_settings/recommended_flight_edit")
        public ModelAndView mainpage_settings_edit(){
            return new ModelAndView("/admin/pages/mainpage_settings/recommended_flight_list/recommended_flight_edit");
        }

        // http://localhost:10000/mainpage_settings/recommended_flight_list
        @RequestMapping("/mainpage_settings/recommended_flight_list")
        public ModelAndView mainpage_settings_list(){
            return new ModelAndView("/admin/pages/mainpage_settings/recommended_flight_list/recommended_flight_list");
        }

        // http://localhost:10000/mainpage_settings/recommended_flight_view
        @RequestMapping("/mainpage_settings/recommended_flight_view")
        public ModelAndView mainpage_settings_view(){
            return new ModelAndView("/admin/pages/mainpage_settings/recommended_flight_list/recommended_flight_view");
        }

        // http://localhost:10000/mainpage_settings/recommended_flight_regist
        @RequestMapping("/mainpage_settings/recommended_flight_regist")
        public ModelAndView mainpage_settings_regist(){
            return new ModelAndView("/admin/pages/mainpage_settings/recommended_flight_regist/recommended_flight_regist");
        }

        // http://localhost:10000/payment/payment_list
        @RequestMapping("/payment/payment_list")
        public ModelAndView payment_list(){
            return new ModelAndView("/admin/pages/payment/payment_list/payment_list");
        }

        // http://localhost:10000/payment/payment_settings_addserv
        @RequestMapping("/payment/payment_settings_addserv")
        public ModelAndView payment_settings_addserv(){
            return new ModelAndView("/admin/pages/payment/payment_settings/payment_settings_addserv");
        }

        // http://localhost:10000/payment/payment_settings_airline
        @RequestMapping("/payment/payment_settings_airline")
        public ModelAndView payment_settings_airline(){
            return new ModelAndView("/admin/pages/payment/payment_settings/payment_settings_airline");
        }

        // http://localhost:10000/payment/payment_settings_multi
        @RequestMapping("/payment/payment_settings_multi")
        public ModelAndView payment_settings_multi(){
            return new ModelAndView("/admin/pages/payment/payment_settings/payment_settings_multi");
        }

        // http://localhost:10000/point/point_list
        @RequestMapping("/point/point_list")
        public ModelAndView point_list(){
            return new ModelAndView("/admin/pages/point/point_list/point_list");
        }

        // http://localhost:10000/point/point_settings
        @RequestMapping("/point/point_settings")
        public ModelAndView point_settings(){
            return new ModelAndView("/admin/pages/point/point_settings/point_settings");
        }

        // http://localhost:10000/reservation/reservation_detail_byflight
        @RequestMapping("/reservation/reservation_detail_byflight")
        public ModelAndView reservation_detail_byflight(){
            return new ModelAndView("/admin/pages/reservation/reservation_list_byflight/reservation_detail_byflight");
        }

        // http://localhost:10000/reservation/reservation_list_byflight
        @RequestMapping("/reservation/reservation_list_byflight")
        public ModelAndView reservation_list_byflight(){
            return new ModelAndView("/admin/pages/reservation/reservation_list_byflight/reservation_list_byflight");
        }

        // http://localhost:10000/reservation/reservation_detail_byname
        @RequestMapping("/reservation/reservation_detail_byname")
        public ModelAndView reservation_detail_byname(){
            return new ModelAndView("/admin/pages/reservation/reservation_namelist/reservation_detail_byname");
        }

        // http://localhost:10000/reservation/reservation_namelist
        @RequestMapping("/reservation/reservation_namelist")
        public ModelAndView reservation_namelist(){
            return new ModelAndView("/admin/pages/reservation/reservation_namelist/reservation_namelist");
        }

        //응수 테스트
        //event 시작(응수)
        @RequestMapping("/admin/event/eventlist")
        public ModelAndView admin_eventList() { return new ModelAndView("/admin/pages/event/event_list/event_list");}

        @RequestMapping("/admin/event/eventEdit")
        public ModelAndView admin_eventEdit() { return new ModelAndView("/admin/pages/event/event_list/event_list_edit");}

        @RequestMapping("/admin/event/eventView")
        public ModelAndView admin_eventView() { return new ModelAndView("/admin/pages/event/event_list/event_list_view");}

        @RequestMapping("/admin/event/eventRegist")
        public ModelAndView admin_eventRegist() { return new ModelAndView("/admin/pages/event/event_regist/event_regist");}
        //event 끝(응수)

        //inquiry/FAQ 시작(응수)
        /*
        안됨 ㅠㅠ
        @RequestMapping("/admin/inquiry/faqList")
        public ModelAndView admin_faqList() {return new ModelAndView("/admin/pages/inquiry/FAQ_list/FAQ_list");}
        */

        @RequestMapping("/admin/inquiry/faqEdit")
        public ModelAndView admin_faqEdit() { return new ModelAndView("/admin/pages/inquiry/FAQ_list/FAQ_list_edit");}

        @RequestMapping("/admin/inquiry/faqInfo")
        public ModelAndView admin_faqInfo() { return new ModelAndView("/admin/pages/inquiry/FAQ_list/FAQ_list_info");}

        @RequestMapping("/admin/inquiry/faqRegist")
        public ModelAndView admin_faqRegist() { return new ModelAndView("/admin/pages/inquiry/FAQ_list/FAQ_regist");}
        //inquiry/FAQ 끝(응수)

        //inquiry/personal 시작(응수)
        @RequestMapping("/admin/inquiry/personalInquiryList")
        public ModelAndView admin_personalInquiryList() { return new ModelAndView("/admin/pages/inquiry/personal_inquiry_list/personal_inquiry_list");}

        @RequestMapping("/admin/inquiry/personalInquiryList2")
        public ModelAndView admin_personalInquiryList2() { return new ModelAndView("/admin/pages/inquiry/personal_inquiry_list/personal_inquiry_list2");}

        @RequestMapping("/admin/inquiry/personalInquiryInfo")
        public ModelAndView admin_personalInquiryInfo() { return new ModelAndView("/admin/pages/inquiry/personal_inquiry_list/personal_inquiry_info");}
        //inquiry/personal 끝(응수)

        //lostItem 시작(응수)
        @RequestMapping("/admin/lostItem/itemEdit")
        public ModelAndView admin_lostItemEdit() { return new ModelAndView("/admin/pages/lost_item/lost_item_list/lost_item_edit");}

        @RequestMapping("/admin/lostItem/itemInfo")
        public ModelAndView admin_lostItemInfo() { return new ModelAndView("/admin/pages/lost_item/lost_item_list/lost_item_info");}

        @RequestMapping("/admin/lostItem/itemList")
        public ModelAndView admin_lostItemList() { return new ModelAndView("/admin/pages/lost_item/lost_item_list/lost_item_list");}

        @RequestMapping("/admin/lostItem/itemRegist")
        public ModelAndView admin_lostItemRegist() { return new ModelAndView("/admin/pages/lost_item/lost_item_register/lost_item_register");}
        //lostItem 끝(응수)


        //응수+은비 부분
        @RequestMapping("/flight_schedule/aircraft_edit")
        public ModelAndView aircraft_edit(){
            return new ModelAndView("/admin/pages/flight_schedule/aircraft_list/aircraft_edit");
        }

        @RequestMapping("/flight_schedule/aircraft_info")
        public ModelAndView aircraft_info(){
            return new ModelAndView("/admin/pages/flight_schedule/aircraft_list/aircraft_info");
        }

        @RequestMapping("/flight_schedule/aircraft_list")
        public ModelAndView aircraft_list(){
            return new ModelAndView("/admin/pages/flight_schedule/aircraft_list/aircraft_list");
        }

        @RequestMapping("/flight_schedule/aircraft_regist")
        public ModelAndView aircraft_regist(){
            return new ModelAndView("/admin/pages/flight_schedule/aircraft_regist/aircraft_regist");
        }

        @RequestMapping("/flight_schedule/destination_edit")
        public ModelAndView destination_edit(){
            return new ModelAndView("/admin/pages/flight_schedule/destination_list/destination_edit");
        }

        @RequestMapping("/flight_schedule/destination_info")
        public ModelAndView destination_info(){
            return new ModelAndView("/admin/pages/flight_schedule/destination_list/destination_info");
        }

        @RequestMapping("/flight_schedule/destination_list")
        public ModelAndView destination_list(){
            return new ModelAndView("/admin/pages/flight_schedule/destination_list/destination_list");
        }

        @RequestMapping("/flight_schedule/destination_regist")
        public ModelAndView destination_regist(){
            return new ModelAndView("/admin/pages/flight_schedule/destination_regist/destination_regist");
        }

        @RequestMapping("/flight_schedule/flight_schedule_edit")
        public ModelAndView flight_schedule_edit(){
            return new ModelAndView("/admin/pages/flight_schedule/flight_schedule_list/flight_schedule_edit");
        }

        @RequestMapping("/flight_schedule/flight_schedule_info")
        public ModelAndView flight_schedule_info(){
            return new ModelAndView("/admin/pages/flight_schedule/flight_schedule_list/flight_schedule_info");
        }

        @RequestMapping("/flight_schedule/flight_schedule_list")
        public ModelAndView flight_schedule_list(){
            return new ModelAndView("/admin/pages/flight_schedule/flight_schedule_list/flight_schedule_list");
        }

        @RequestMapping("/flight_schedule/flight_schedule_regist")
        public ModelAndView flight_schedule_regist(){
            return new ModelAndView("/admin/pages/flight_schedule/flight_schedule_regist/flight_schedule_regist");
        }

    }


