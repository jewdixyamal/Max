package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: qm4  reason: default package */
public final class qm4 {
    public final String a;

    public qm4(String str, int i) {
        switch (i) {
            case 1:
                this.a = wg0.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
                return;
            default:
                this.a = str;
                return;
        }
    }

    public static qm4 a(yaf yaf) {
        String str;
        yaf.I(2);
        int v = yaf.v();
        int i = v >> 1;
        int v2 = ((yaf.v() >> 3) & 31) | ((v & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = v2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 24);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(v2);
        return new qm4(sb.toString(), 0);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return rh4.j(str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.a, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            d(this.a, str, objArr);
        }
    }
}
