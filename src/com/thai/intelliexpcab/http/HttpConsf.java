package com.thai.intelliexpcab.http;

public class HttpConsf {

    //base url
    public static final String BASE_URL = "http://127.0.0.1:8081";

    /**
     * 派件模块
     */
    public static final String SEND_CODE = BASE_URL + "/senddel/sendcode";//生成送件码
    public static final String OPEN_DEL_BY_SEND = BASE_URL + "/senddel/opendel";//快递员输入送件码开柜操作
    public static final String TAKE_CODE = BASE_URL + "/senddel/takecode";//关闭柜门时,生产取件码


    /**
     * 管理模块
     */
    public static final String ADMIN = BASE_URL + "/admindel/admin";//判断管理员密码是否正确
    public static final String URL = BASE_URL + "/admindel/url";//修改或获取url
    public static final String OPEN_DEL = BASE_URL + "/admindel/opendel";//打开指定快递柜门
    public static final String PASSWORD = BASE_URL + "/admindel/password";//修改快递柜密码
    public static final String UPDATE_DEL_VER = BASE_URL + "/admindel/sendVersion";//强制更新快递柜版本号

    public static final String LOGIN = BASE_URL + "/admin/login";//登录
    public static final String USER = BASE_URL + "/admin/user";//添加或获取管理员
    public static final String MOD_USER = BASE_URL + "/admin/moduser";//修改管理员信息
    public static final String DEL_USER = BASE_URL + "/admin/deluser";//删除管理员
    public static final String GET_USER_INFO = BASE_URL + "/admin/use";//获取管理员详细信息

    public static final String QUERY_ALL_DEL = BASE_URL + "/deliveryManage/queryAllDeliveryLockersInfo";//查询所有快递柜信息
    public static final String QUERY_DEL_BY_NO = BASE_URL + "/deliveryManage/queryDeliveryLockersInfoByDeliveryNo";//通过DeliveryNo查询指定DeliveryLockers信息
    public static final String QUERY_DEL_BY_STA = BASE_URL + "/deliveryManage/queryDeliveryLockersInfoByDeliveryStatus";//按快递柜初始化状态查询快递柜信息
    public static final String UPDATE_DEL_INFO = BASE_URL + "/deliveryManage/updateDeliveryLockersInfo";//修改DeliveryLockers信息
    public static final String DELETTE_DEL = BASE_URL + "/deliveryManage/delectDeliveryLockers";//删除快递柜
    public static final String INIT_DEL = BASE_URL + "/deliveryManage/initDeliveryLockers";//初始化快递柜获取编号
    public static final String QUERY_DEL_MDOE = BASE_URL + "/deliveryManage/queryAllDeliveryLockersModel";//查询所有型号的快递柜型号信息
    public static final String ADD_DEL_MODE = BASE_URL + "/deliveryManage/addDeliveryLockersModel";//添加快递柜型号信息
    public static final String DEL_DEL_MODE = BASE_URL + "/deliveryManage/delectDeliveryLockersModelByModelId";//删除快递柜型号信息

    public static final String DELETE_IMG = BASE_URL + "/banner/delban";//删除指定图片

    /**
     * 取件模块
     */
    public static final String OPEN_DEL_BY_TAKE = BASE_URL + "/takeDelivery/openDeliveryDoor";//用户取件输入取件码开柜验证
    public static final String TAKE_SUCCESS = BASE_URL + "/takeDelivery/takeDeliverySuccess";//用户关闭柜门取件成功

    public static final String QUERY_TAKE_CODE_BY_PHONE = BASE_URL + "/selectTakeNumber/selectTakeNumberByPhone";//通过手机号码查询取件码
    public static final String QUERY_TAKE_CODE_BY_ORDER = BASE_URL + "/selectTakeNumber/selectTakeNumberByOrderNumber";//通过订单号查询取件码
    public static final String QUERY_TAKE_CODE_BY_BOTH = BASE_URL + "/selectTakeNumber/selectTakeNumberByPhoneAndOrderNumber";//通过手机号码和订单号查询取件码

    /**
     * 升级模块
     */
    public static final String VERSION = BASE_URL + "/admindel/version";//升级或查询最新版本号

    public static final String FINISH_UPDATE = BASE_URL + "/versionUpgradeController/finishVersionUpgrade";//版本升级完成
    public static final String QUERY_ALL_VER = BASE_URL + "/versionUpgradeController/queryAllVersion";//查询所有版本号
    public static final String QUERY_ALL_UPDATE_INFO = BASE_URL + "/versionUpgradeController/queryAllFinishVersionUpgradeInfo";//查询所有升级完成的信息
    //根据deliveryNo(快递柜编号)查询所有升级信息
    public static final String QUERY_ALL_UPDATE_INFO_BY_DELNO = BASE_URL + "/versionUpgradeController/queryFinishVersionUpgradeInfoByDeliveryNo";
    //根据版本号查询所有升级信息
    public static final String QUERY_ALL_UPDATE_INFO_BY_VER = BASE_URL + "/versionUpgradeController/queryFinishVersionUpgradeInfoByVersion";

    /**
     * 广告模块
     */
    public static final String ADD_IMG = BASE_URL + "/banner/ban";//添加广告图片
    public static final String QUERY_ALL_ADS = BASE_URL + "/banner/bans";//查找所有广告
    public static final String GET_ALL_USING_BAN = BASE_URL + "/banner/usebans";//查找所有正在使用的广告
    public static final String UPDATE_AD = BASE_URL + "/banner/modbans";//修改广告

    /**
     * 统计模块
     */
    public static final String STAT_DEL = BASE_URL + "/deliveryManage/statDelivery";//获取数据统计信息

    /**
     * 状态码
     */
    public static final int PARAMETER_ILLEGAL = 1444;
    public static final int SEND_CODE_NOT_EXIST = 1500;
    public static final int INVALID_SERVICE = 199;
    public static final int SUCCESS = 200;
    public static final int LOCKER_FULL = 2000;
    public static final int TAKE_NUM_ERROR = 3000;
    public static final int PASSWORD_ERROR = 3001;
    public static final int PHONE_NUM_ERROR = 3002;
    public static final int PHONE_OR_ORDER_NUM_ERROR = 3003;
    public static final int DELIVERY_NUMBER_ERROR = 3004;
    public static final int ACCOUNT_NOT_EXIST = 3005;
    public static final int ACCOUNT_NOT_INACTIVE = 3006;
    public static final int ACC_OR_PWD_CANNOT_BE_EMPTY = 3007;
    public static final int BUSI_ERROR = 4000;
    public static final int SERVICE_EXCEPTION = 5000;
    public static final int UNKNOWN_ERROR = 999;

    public static String getStatus(int status) {
        switch (status) {
            case PARAMETER_ILLEGAL:
                return "参数错误";
            case SEND_CODE_NOT_EXIST:
                return "派件码不存在";
            case INVALID_SERVICE:
                return "服务不可用";
            case SUCCESS:
                return "成功";
            case LOCKER_FULL:
                return "储物柜已满";
            case TAKE_NUM_ERROR:
                return "取件码错误";
            case PASSWORD_ERROR:
                return "快递柜管理密码错误";
            case PHONE_NUM_ERROR:
                return "手机号码不符合要求";
            case PHONE_OR_ORDER_NUM_ERROR:
                return "手机号或订单号错误";
            case DELIVERY_NUMBER_ERROR:
                return "柜子编号错误";
            case ACCOUNT_NOT_EXIST:
                return "账号不存在";
            case ACCOUNT_NOT_INACTIVE:
                return "账号不可用";
            case ACC_OR_PWD_CANNOT_BE_EMPTY:
                return "账号或密码不能为空";
            case BUSI_ERROR:
                return "内容错误";
            case SERVICE_EXCEPTION:
                return "服务异常";
            case UNKNOWN_ERROR:
                return "未知错误";
        }
        return "";
    }
}
