package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpStatus;

/* renamed from: zq6  reason: default package */
public final class zq6 extends mr0 {
    public final int n;
    public final ExecutorService o = Executors.newFixedThreadPool(3);
    public final hc9 p;

    public zq6() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.p = realtimeSinceBootClock;
        this.n = 30000;
    }

    public final HashMap D(hf5 hf5, int i) {
        yq6 yq6 = (yq6) hf5;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(yq6.e - yq6.d));
        hashMap.put("fetch_time", Long.toString(yq6.f - yq6.e));
        hashMap.put("total_time", Long.toString(yq6.f - yq6.d));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public final void P(hf5 hf5) {
        ((yq6) hf5).f = this.p.now();
    }

    public final HttpURLConnection c0(Uri uri, int i) {
        URL url;
        String str;
        Uri uri2 = e9f.a;
        Uri uri3 = null;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.n);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (!(responseCode == 307 || responseCode == 308)) {
            switch (responseCode) {
                case HttpStatus.SC_MULTIPLE_CHOICES /*300*/:
                case HttpStatus.SC_MOVED_PERMANENTLY /*301*/:
                case HttpStatus.SC_MOVED_TEMPORARILY /*302*/:
                case HttpStatus.SC_SEE_OTHER /*303*/:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        if (headerField != null) {
            uri3 = Uri.parse(headerField);
        }
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !j47.B(uri3.getScheme(), scheme)) {
            return c0(uri3, i - 1);
        }
        if (i == 0) {
            String uri4 = uri.toString();
            Locale.getDefault();
            str = "URL " + uri4 + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", new Object[]{uri.toString(), Integer.valueOf(responseCode)});
        }
        throw new IOException(str);
    }

    public final hf5 n(fi0 fi0, eab eab) {
        return new hf5(fi0, eab);
    }

    public final void t(hf5 hf5, h7b h7b) {
        yq6 yq6 = (yq6) hf5;
        yq6.d = this.p.now();
        ((oj0) yq6.b).a(new xq6(this.o.submit(new wi3(3, this, yq6, h7b, false)), 0, h7b));
    }
}
