package com.vueblog.demo.util;

import com.vueblog.demo.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author liumeng
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
