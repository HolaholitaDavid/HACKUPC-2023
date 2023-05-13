package com.example.demo.Utils;

import java.util.List;

public class ConstURLS {
     public static final String ENHANCE = "auto_enhancement";
     public static final String SCORE = "re_condition_r1r6_international";
     public static final String FEATURES = "re_features_v4";
     public static final String base_url =
            "https://api-eu.restb.ai/vision/v2/multipredict?client_key=de16fead467ec83f535085d69472c4e77e3ba8edf6f7b43f994c70cd3ceb9571";

     public static final String formatURL(String model, String imageURL) {
          return base_url+"&model_id="+model+"&image_url="+imageURL;
     }
     public static final String formatMultiURL(List<String> models, String imageURL) {
          String modelsString = "";
          for (String model : models) {
               modelsString += model+",";
          }
          modelsString = modelsString.substring(0, modelsString.length()-1);
          return base_url+"&model_id="+modelsString+"&image_url="+imageURL;
     }
     public static final String formatMultiURL64(List<String> models, String imageURL) {
          String modelsString = "";
          for (String model : models) {
               modelsString += model+",";
          }
          modelsString = modelsString.substring(0, modelsString.length()-1);
          return base_url+"&model_id="+modelsString+"&image_base64="+imageURL;
     }
}
