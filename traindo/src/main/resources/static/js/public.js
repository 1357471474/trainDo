/**
  * Created by 20170810001 on 2018/10/24.
 */
$(function () {
	$.ajaxSetup({
	    statusCode: {
//	        499: function (data) {
//	            window.location.href = baseUrl + "/static/error/otherLogin.jsp";
//	        },
	        4999:function (data) {
	        	layer.msg("账号超时，请重新登录！");
	        	setTimeout('window.location.href = _serverIp',1500);
	        }
	    }
	});
});
//const _serverIp = getUrl();
const _serverIp = "localhost:8088";
var _uId = 0;
function getUrl() {
    var host = location.host; //获取url中"?"符后的字串  
//    var theRequest = new Object();
//    if (url.indexOf("?") != -1) {
//        var str = url.substr(1);
//        strs = str.split("&");
//        for (var i = 0; i < strs.length; i++) {
//            theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
//        }
//    }
    return "http://"+host;
}

//获取当月第一日期
function getNowFormatDateStart() {
    var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + '01';
    return currentdate;
}
//获取日期
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;
}
/**
 *获取当前时间 yy-MM-dd hh:mm:ss
 **/
function getNowData() {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    var hour = date.getHours();
    var minute = date.getMinutes();
    var second = date.getSeconds();

    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    if (hour >= 0 && hour <= 9) {
        hour = "0" + hour;
    }
    if (minute >= 0 && minute <= 9) {
        minute = "0" + minute;
    }
    if (second >= 0 && second <= 9) {
        second = "0" + second;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate + ' ' + hour + seperator2 + minute + seperator2 + second;
    return currentdate;
}


// 地址栏传参
function GetQuery(key) {
    var search = location.search.slice(1); //�õ�get��ʽ�ύ�Ĳ�ѯ�ַ���
    var arr = search.split("&");
    for (var i = 0; i < arr.length; i++) {
        var ar = arr[i].split("=");
        if (ar[0] == key) {
            if (unescape(ar[1]) == 'undefined') {
                return "";
            } else {
                return unescape(ar[1]);
            }
        }
    }
    return "";
}


// 导入
function postExport(url) {
    var form = $("<form>"); //����һ��form��
    form.attr("style", "display:none");
    form.attr("target", "");
    form.attr("method", "post"); //��������
    form.attr("action", url); //�����ַ
    $("body").append(form); //����������web��
    form.submit(); //���ύ
}


//时间数据格式处理
function checkTime(i) {
    if (i < 10) {
        i = "0" + i;
    }
    return i;
}

//年月日时分秒
function renderTime(data) {
    if (data == null) {
        return "";
    }
    var da = eval('new ' + data.replace('/', '', 'g').replace('/', '', 'g'));
    youWant = da.getFullYear() + '-' + checkTime((da.getMonth() + 1)) + '-' + checkTime(da.getDate()) + ' ' + checkTime(da.getHours()) + ':' + checkTime(da.getMinutes()) + ':' + checkTime(da.getSeconds());
    return youWant; //da.getFullYear() + "年" + da.getMonth() + "月" + da.getDay() + "日" + da.getHours() + ":" + da.getSeconds() + ":" + da.getMinutes();
}

//年月日
function renderTime2(data) {
    if (data == null) {
        return "";
    }
    var da = eval('new ' + data.replace('/', '', 'g').replace('/', '', 'g'));
    youWant = da.getFullYear() + '-' + checkTime((da.getMonth() + 1)) + '-' + checkTime(da.getDate()) + ' ';
    return youWant; //da.getFullYear() + "年" + da.getMonth() + "月" + da.getDay() + "日" + da.getHours() + ":" + da.getSeconds() + ":" + da.getMinutes();
}

//年月
function renderTime3(data) {
    if (data == null) {
        return "";
    }
    var da = eval('new ' + data.replace('/', '', 'g').replace('/', '', 'g'));
    youWant = da.getFullYear() + '-' + checkTime((da.getMonth() + 1));
    return youWant; //da.getFullYear() + "年" + da.getMonth() + "月" + da.getDay() + "日" + da.getHours() + ":" + da.getSeconds() + ":" + da.getMinutes();
}

//年月日时
function renderTime4(data) {
    if (data == null) {
        return "";
    }
    var da = eval('new ' + data.replace('/', '', 'g').replace('/', '', 'g'));
    youWant = da.getFullYear() + '-' + checkTime((da.getMonth() + 1)) + '-' + checkTime(da.getDate()) + ' ' + checkTime(da.getHours());
    return youWant; //da.getFullYear() + "年" + da.getMonth() + "月" + da.getDay() + "日" + da.getHours() + ":" + da.getSeconds() + ":" + da.getMinutes();
}

//地区三级联动初始化
function initSiteSelect(url) {
    $.getJSON(url, function(json) {
        var province = $('#province');
        var city = $('#city');
        var district = $('#district');
        var provinceHtml = '';
        var cityHtml = '';
        var districtHtml = '';
        for (var i in json) {
            provinceHtml += '<option value="' + i + '">' + i + '</option>';
        }
        province.html(provinceHtml);
        //綁定事件
        //省级变动
        province.change(function() {
            var _data = json[province.val()];
            cityHtml = '';
            if (!_data || JSON.stringify(_data) == "{}") {
                city.hide();
                district.hide();
                return;
            }
            for (var i in _data) {
                cityHtml += '<option value="' + i + '">' + i + '</option>';
            }
            city.html(cityHtml);
            city.show();
            city.trigger('change');
        });
        //市级变动
        city.change(function() {
            var _data = json[province.val()][city.val()];
            districtHtml = '';
            if (!_data) return district.hide();
            for (var i in _data) {
                districtHtml += '<option value="' + i + '">' + i + '</option>';
            }
            district.html(districtHtml);
            district.show();
        });

        province.trigger('change');
    });
}

/**
 * 设置cookie
 * @param name cookie的名称
 * @param value cookie的值
 * @param day cookie的过期时间
 */
var setCookie = function(name, value, day) {
    if (day !== 0) { //当设置的时间等于0时，不设置expires属性，cookie在浏览器关闭后删除
        var expires = day * 24 * 60 * 60 * 1000;
        var date = new Date(+new Date() + expires);
        document.cookie = name + "=" + escape(value) + ";expires=" + date.toUTCString() +"; path=/";
    } else {
        document.cookie = name + "=" + escape(value) + "; path=/";
    }
};
/**
 * 获取对应名称的cookie
 * @param name cookie的名称
 * @returns {null} 不存在时，返回null
 */
var getCookie = function(name) {
    var arr;
    var reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
    if (arr = document.cookie.match(reg))
        return unescape(arr[2]);
    else
        return null;
};

