package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.List;

/* renamed from: yqc  reason: default package */
public abstract class yqc {
    public final hj9 a;
    public final int b;
    public final f99 c;
    public boolean d;

    public yqc(qy5 qy5, hj9 hj9) {
        this.a = hj9;
        this.c = qy5.k;
        this.b = np8.w(qy5.n);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ix6, pw6] */
    public static String i(qy5 qy5, List list) {
        String str;
        String str2 = qy5.n;
        fm9.h(str2);
        boolean k = ia9.k(str2);
        ? pw6 = new pw6(4);
        pw6.j(str2);
        if (k) {
            pw6.j("video/hevc");
            pw6.j("video/avc");
        }
        pw6.k(list);
        zw6 a2 = pw6.l().a();
        int i = 0;
        while (true) {
            int size = a2.size();
            i63 i63 = qy5.A;
            if (i < size) {
                String str3 = (String) a2.get(i);
                if (list.contains(str3)) {
                    if (!k || !i63.g(i63)) {
                        if (!h15.f(str3).isEmpty()) {
                            return str3;
                        }
                    } else if (!h15.g(str3, i63).isEmpty()) {
                        return str3;
                    }
                }
                i++;
            } else {
                boolean k2 = ia9.k(str2);
                if (!k2 || !i63.g(i63)) {
                    str = "No MIME type is supported by both encoder and muxer.";
                } else {
                    str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + i63;
                }
                throw ExportException.c(new IllegalArgumentException(str), 4003, new qh3(qy5.toString(), (String) null, k2, false));
            }
        }
    }

    public abstract sf6 j(lv4 lv4, qy5 qy5, int i);

    public abstract p54 k();

    public abstract qy5 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void o();

    public abstract void p();
}
