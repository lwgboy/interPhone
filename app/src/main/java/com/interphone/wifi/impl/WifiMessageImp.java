package com.interphone.wifi.impl;

import android.app.Activity;
import android.app.ProgressDialog;

import com.interphone.BaseActivity;
import com.interphone.wifi.IWifiMessage;
import com.zlandzbt.tools.jv.utils.LogUtils;
import com.zlandzbt.tools.jv.utils.UIUtils;

public class WifiMessageImp implements IWifiMessage {
    Activity mContext;
    static final String TAG = BaseActivity.TAG;

    public WifiMessageImp(Activity activity) {
        mContext = activity;
    }

    @Override
    public void wifiConnectFailed() {
        UIUtils.showToast(mContext.getApplicationContext(), "连接失败");
    }

    @Override
    public void wifiConnecting() {

    }

    @Override
    public void wifiAuthenticating() {

    }

    @Override
    public void wifiObtainingIP() {

    }

    @Override
    public void wifiConnected() {
        UIUtils.showToast(mContext.getApplicationContext(), "wifi已连接");
        LogUtils.i(TAG, "wifi已连接");
    }

    @Override
    public void wifiHasBeenConnected() {
        UIUtils.showToast(mContext.getApplicationContext(), "当前已连接该wifi");
        LogUtils.i(TAG, "当前已连接该wifi");
    }

    @Override
    public void wifiSuspended() {

    }

    @Override
    public void wifiDisconnecting() {

    }

    @Override
    public void wifiDisconnected() {
        // UIUtils.showToast(mContext.getApplicationContext(),"wifi已断开连接");
        LogUtils.i(TAG, "wifi已断开连接");
    }

    @Override
    public void wifiBlocked() {

    }

    @Override
    public void openWifi() {
        UIUtils.showToast(mContext.getApplicationContext(), "开启wifi");
        LogUtils.i(TAG, "开启wifi");
    }

    @Override
    public void wifiIsOpening() {
        UIUtils.showToast(mContext.getApplicationContext(), "wifi正在开启中，请耐心等待");
        LogUtils.i(TAG, "wifi正在开启中，请耐心等待");
    }

    @Override
    public void wifiHasBeenOpened() {
        UIUtils.showToast(mContext.getApplicationContext(), "wifi已开启");
        LogUtils.i(TAG, "wifi已开启");
    }

    @Override
    public void wifiOpenFailed() {
        UIUtils.showToast(mContext.getApplicationContext(), "发生未知错误，请重新开启");
        LogUtils.i(TAG, "发生未知错误，请重新开启");
    }

    @Override
    public void closeWifi() {
        UIUtils.showToast(mContext.getApplicationContext(), "关闭wifi");
        LogUtils.i(TAG, "关闭wifi");
    }

    @Override
    public void wifiIsClosing() {
        UIUtils.showToast(mContext.getApplicationContext(), "wifi正在关闭中");
        LogUtils.i(TAG, "wifi正在关闭中");
    }

    @Override
    public void wifiHasBeenClosed() {
        UIUtils.showToast(mContext.getApplicationContext(), "wifi已经关闭");
        LogUtils.i(TAG, "wifi已经关闭");
    }

    @Override
    public void closeWifiFailed() {
        UIUtils.showToast(mContext.getApplicationContext(), "发生未知错误，请重试");
        LogUtils.i(TAG, "发生未知错误，请重试");
    }

    @Override
    public ProgressDialog wifiScan() {
        LogUtils.i(TAG, "正在扫描，请稍后");
        return UIUtils.showLoading(mContext, "正在扫描，请稍后");

    }

    @Override
    public void wifiScanFaild() {
        UIUtils.showToast(mContext.getApplicationContext(), "扫描失败，请重试");
        LogUtils.i(TAG, "扫描失败，请重试");
    }

    @Override
    public void passwordShouldNotBeEmpty() {
        UIUtils.showToast(mContext.getApplicationContext(), "请输入密码");
        LogUtils.i(TAG, "请输入密码");
    }

    @Override
    public void passwordError() {
        UIUtils.showToast(mContext.getApplicationContext(), "密码错误");
        LogUtils.i(TAG, "密码错误");
    }

    @Override
    public void unKnownError() {
        LogUtils.i(TAG, "发生未知错误，操作失败");
        UIUtils.showAlertMessage(mContext, "错误", "发生未知错误，操作失败");
    }

    @Override
    public void openApSuccess() {
        LogUtils.i(TAG, "热点开启成功");
        UIUtils.showToast(mContext, "热点开启成功");
    }

    @Override
    public void closeApSuccess() {
        LogUtils.i(TAG, "热点关闭成功");
        UIUtils.showToast(mContext, "热点关闭成功");
    }

    @Override
    public void openApFailed() {
        LogUtils.i(TAG, "热点开启失败");
        UIUtils.showToast(mContext, "热点开启失败");
    }

    @Override
    public void closeApFailed() {
        LogUtils.i(TAG, "热点关闭失败");
        UIUtils.showToast(mContext, "热点关闭失败");
    }
}
