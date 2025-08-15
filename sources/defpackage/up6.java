package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.http.HttpStatusApiException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: up6  reason: default package */
public final class up6 implements vk {
    public final xxc a;
    public final jt3 b = new jt3(2);
    public final crd c = crd.s0;
    public final yxc d = mw3.a;
    public hl e = hl.a;

    public up6(xxc xxc) {
        this.a = xxc;
    }

    public final Object a(yk ykVar, wk wkVar) {
        int i;
        String str;
        lq6 lq6;
        lq6 lq62;
        crd crd = this.c;
        try {
            this.e.debugApiRequest(this, ykVar, wkVar);
            a8g b2 = b(ykVar, wkVar);
            zs zsVar = (zs) b2.c;
            this.a.getClass();
            rq6 k = xxc.k(b2);
            zs zsVar2 = (zs) k.c;
            int i2 = k.b;
            if (i2 == 200) {
                try {
                    k36 k36 = (k36) k.o;
                    k36.getClass();
                    eb7 a2 = eb7.a(new BufferedInputStream(((HttpURLConnection) k36.b).getInputStream()));
                    if (zsVar2.a(SM.SET_COOKIE)) {
                        yxc yxc = this.d;
                        mw3.a(zsVar2);
                        yxc.getClass();
                    }
                    if (zsVar2.a("Invocation-Error") || zsVar2.a("WMF-Invocation-Error")) {
                        throw ((Throwable) ykVar.getFailParser().parse(this.e.debugApiResponseFail(this, ykVar, a2)));
                    }
                    i = 0;
                    str = null;
                    Object parse = ykVar.getOkParser().parse(this.e.debugApiResponseOk(this, ykVar, a2));
                    lq6[] lq6Arr = (lq6[]) zsVar.b;
                    int length = lq6Arr.length;
                    while (true) {
                        if (i >= length) {
                            lq62 = null;
                            break;
                        }
                        lq62 = lq6Arr[i];
                        if (eae.k0(lq62.a, "Geo-Position", true)) {
                            break;
                        }
                        i++;
                    }
                    if ((lq62 != null ? lq62.b : null) != null) {
                        crd.getClass();
                    }
                    v3c.i(k, (Throwable) null);
                    return parse;
                } catch (JsonSyntaxException e2) {
                    throw new Exception(e2);
                } catch (JsonParseException e3) {
                    throw new Exception(e3);
                } catch (JsonSyntaxException e4) {
                    throw new Exception(e4);
                } catch (JsonParseException e5) {
                    throw new Exception(e5);
                } catch (Throwable th) {
                    v3c.i(k, th);
                    throw th;
                }
            } else {
                throw new HttpStatusApiException(i2);
            }
        } catch (ApiException e6) {
            this.e.debugApiException(this, ykVar, e6);
            throw e6;
        } catch (IOException e7) {
            this.e.debugIoException(this, ykVar, e7);
            throw e7;
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, pkg] */
    public final a8g b(fl flVar, wk wkVar) {
        String str;
        Object obj;
        String str2;
        ArrayList arrayList = new ArrayList();
        flVar.getPriority();
        boolean shouldPost = flVar.shouldPost();
        int i = 1;
        jt3 jt3 = this.b;
        if (shouldPost) {
            str2 = jt3.a(flVar).toString();
            arrayList.add(new lq6(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE));
            if (flVar.shouldGzip()) {
                arrayList.add(new lq6(HTTP.CONTENT_ENCODING, "gzip"));
            }
            if (str2.equals("https") || eae.o0(str2, "https:", false)) {
                i = 2;
            }
            ? obj2 = new Object();
            obj2.o = this;
            obj2.a = flVar;
            obj2.c = wkVar;
            obj2.b = i;
            str = HttpPost.METHOD_NAME;
            obj = obj2;
        } else {
            str2 = jt3.a(flVar).toString();
            int i2 = 3;
            if (wp6.$EnumSwitchMapping$0[au1.s(3)] == 1) {
                if (str2.equals("https") || eae.o0(str2, "https:", false)) {
                    i = 2;
                }
                i2 = i;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jt3.f(byteArrayOutputStream, flVar, wkVar, i2);
            if (byteArrayOutputStream.size() != 0) {
                StringBuilder o = rh4.o(str2, w9e.z0(str2, '?', 0, false, 6) < 0 ? "?" : "&");
                o.append(byteArrayOutputStream.toString("UTF-8"));
                str2 = o.toString();
            }
            obj = null;
            str = HttpGet.METHOD_NAME;
        }
        if (flVar instanceof bl0) {
            String str3 = ((bl0) flVar).a;
            if (str3 != null) {
                "batch.executeV2-".concat(str3);
            }
        } else {
            Uri uri = flVar.getUri();
            if (!tpa.f(uri.getScheme(), "ok") || !tpa.f(uri.getAuthority(), "api")) {
                uri.getPath();
            } else {
                sl.b(uri);
            }
        }
        if (tpa.f(flVar.getUri().getAuthority(), "api")) {
            this.c.getClass();
            this.d.getClass();
        }
        arrayList.add(new lq6("Accept", "application/json"));
        if (str2 != null) {
            return new a8g(str, str2, new zs(1, (lq6[]) arrayList.toArray(new lq6[0])), obj);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
