package com.example.beebuuserver.Common;

import com.example.beebuuserver.Model.Request;
import com.example.beebuuserver.Model.User;
import com.example.beebuuserver.Remote.APIService;
import com.example.beebuuserver.Remote.FCMRetrofitClient;
import com.example.beebuuserver.Remote.IGeoCoordinates;
import com.example.beebuuserver.Remote.RetrofitClient;

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String baseUrl = "https://maps.googleapis.com";
    public static String fcmUrl = "https://fcm.googleapis.com/";

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
        {
            return "Ordered!";
        }else if(code.equals("1"))
        {
            return "On the way!";
        }else
        {
            return "Shipped!";
        }
    }

    public static APIService getFCMService()
    {
        return FCMRetrofitClient.getClient(fcmUrl).create(APIService.class);
    }

    public static IGeoCoordinates getGeoCodeService(){
        return RetrofitClient.getClient(baseUrl).create(IGeoCoordinates.class);
    }
}
