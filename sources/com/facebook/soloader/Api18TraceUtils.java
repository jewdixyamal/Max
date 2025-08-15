package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
@om4
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String j = rh4.j(str, str2, str3);
        if (j.length() > 127 && str2 != null) {
            StringBuilder l = au1.l(str);
            l.append(str2.substring(0, (127 - str.length()) - str3.length()));
            l.append(str3);
            j = l.toString();
        }
        Trace.beginSection(j);
    }
}
