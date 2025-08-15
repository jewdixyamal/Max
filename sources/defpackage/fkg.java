package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fkg  reason: default package */
public final class fkg {
    public static final o97 e = new o97("AppUpdateService", 2);
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final ykg a;
    public final String b;
    public final Context c;
    public final kkg d;

    public fkg(Context context, kkg kkg) {
        int length;
        String str;
        this.b = context.getPackageName();
        this.c = context;
        this.d = kkg;
        o97 o97 = efg.a;
        try {
            int i = 0;
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    boolean isLoggable = Log.isLoggable("PlayCore", 5);
                    o97 o972 = efg.a;
                    if (isLoggable) {
                        o97.c(o972.b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    } else {
                        o972.getClass();
                    }
                } else {
                    while (i < length) {
                        byte[] byteArray = signatureArr[i].toByteArray();
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            instance.update(byteArray);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                                i++;
                            }
                        }
                        Context applicationContext = context.getApplicationContext();
                        this.a = new ykg(applicationContext != null ? applicationContext : context, e);
                        return;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(fkg fkg, String str) {
        Map map;
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap hashMap = lig.a;
        synchronized (lig.class) {
            try {
                HashMap hashMap2 = lig.a;
                if (!hashMap2.containsKey("app_update")) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("java", 11004);
                    hashMap2.put("app_update", hashMap3);
                }
                map = (Map) hashMap2.get("app_update");
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(fkg.c.getPackageManager().getPackageInfo(fkg.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            o97 o97 = e;
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                o97.c(o97.b, "The current version of the app could not be retrieved", objArr);
            } else {
                o97.getClass();
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
