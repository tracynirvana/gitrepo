package com.jbit.ischool.controller;
/**
 * 	处理用户请求的Action
 * @author Administrator
 *
 */
public class UserAction {
	/**
	 * 处理登录请求的方法
	 * @return
	 */
	public String login() {
		System.out.println("login progress!!");
		return "suc";
	}
}
