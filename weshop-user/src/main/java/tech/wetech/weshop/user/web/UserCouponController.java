package tech.wetech.weshop.user.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.user.api.UserCouponApi;
import tech.wetech.weshop.user.po.UserCoupon;

@RestController
@RequestMapping("/UserCoupon")
public class UserCouponController extends BaseApi<UserCoupon> implements UserCouponApi {
}
