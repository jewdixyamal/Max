package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* renamed from: qt2  reason: default package */
public final class qt2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    public /* synthetic */ qt2(int i, je7 je7) {
        this.a = i;
        this.b = je7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((wt2) this.b.getValue()).a().b());
            default:
                je7 je7 = this.b;
                t9f h = ((ri4) je7.getValue()).h();
                t9f h2 = ((ri4) je7.getValue()).h();
                t9f h3 = ((ri4) je7.getValue()).h();
                t9f h4 = ((ri4) je7.getValue()).h();
                StringBuilder sb = new StringBuilder("OKMessages/");
                sb.append(h.b);
                sb.append(" (");
                sb.append(h2.e);
                sb.append("; ");
                sb.append(h3.h);
                sb.append("; ");
                String l = zr6.l(sb, h4.i, ")");
                try {
                    return URLEncoder.encode(l, Charset.defaultCharset().name());
                } catch (UnsupportedEncodingException unused) {
                    return l;
                }
        }
    }
}
