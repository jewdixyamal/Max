package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* renamed from: dhg  reason: default package */
public final class dhg implements Runnable {
    public static final jn c = new jn("RevokeAccessOperation", new String[0]);
    public final String a;
    public final a2e b = new BasePendingResult((mdg) null);

    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.android.gms.common.api.internal.BasePendingResult, a2e] */
    public dhg(String str) {
        fp3.j(str);
        this.a = str;
    }

    public final void run() {
        jn jnVar = c;
        Status status = Status.Z;
        try {
            String valueOf = String.valueOf(this.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.X;
            } else {
                jnVar.r("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            String sb2 = sb.toString();
            Object[] objArr = new Object[0];
            if (jnVar.b <= 3) {
                jnVar.r(sb2, objArr);
            }
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.toString());
            jnVar.r(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(e2.toString());
            jnVar.r(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.b.S(status);
    }
}
