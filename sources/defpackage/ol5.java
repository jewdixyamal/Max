package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: ol5  reason: default package */
public final class ol5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public ol5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = v9e.a;
        fp3.p("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static ol5 a(Context context) {
        b9b b9b = new b9b(context, 7);
        String n = b9b.n("google_app_id");
        if (TextUtils.isEmpty(n)) {
            return null;
        }
        return new ol5(n, b9b.n("google_api_key"), b9b.n("firebase_database_url"), b9b.n("ga_trackingId"), b9b.n("gcm_defaultSenderId"), b9b.n("google_storage_bucket"), b9b.n("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ol5)) {
            return false;
        }
        ol5 ol5 = (ol5) obj;
        return s36.l(this.b, ol5.b) && s36.l(this.a, ol5.a) && s36.l(this.c, ol5.c) && s36.l(this.d, ol5.d) && s36.l(this.e, ol5.e) && s36.l(this.f, ol5.f) && s36.l(this.g, ol5.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(this.b, "applicationId");
        qz7.h(this.a, "apiKey");
        qz7.h(this.c, "databaseUrl");
        qz7.h(this.e, "gcmSenderId");
        qz7.h(this.f, "storageBucket");
        qz7.h(this.g, "projectId");
        return qz7.toString();
    }
}
