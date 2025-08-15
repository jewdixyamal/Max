package defpackage;

import android.net.Uri;

/* renamed from: ax  reason: default package */
public final class ax implements s7c, a95 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public volatile Object o;

    public /* synthetic */ ax(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public Object T0(Object obj, bc7 bc7) {
        switch (this.a) {
            case 0:
                Object obj2 = this.o;
                if (obj2 != null) {
                    return obj2;
                }
                Object value = ((je7) this.b).getValue();
                this.o = value;
                return value;
            default:
                Object obj3 = this.o;
                if (obj3 != null) {
                    return obj3;
                }
                Object value2 = ((je7) this.b).getValue();
                this.o = value2;
                return value2;
        }
    }

    public void b() {
        ((nl) this.b).setSessionInfo((ml) null);
        jxc jxc = jxc.c;
        ((p31) this.c).getClass();
        d(jxc.b("CGPGAGLGDIHBABABA"));
    }

    public jxc c() {
        String str;
        jxc jxc = (jxc) this.o;
        if (jxc == null) {
            ml sessionInfo = ((nl) this.b).getSessionInfo();
            jxc jxc2 = jxc.c;
            ((p31) this.c).getClass();
            jxc b2 = jxc2.b("CGPGAGLGDIHBABABA");
            String str2 = null;
            if ((sessionInfo != null ? sessionInfo.c : null) != null) {
                b2 = b2.d(Uri.parse(sessionInfo.c));
            }
            if (sessionInfo != null) {
                str2 = sessionInfo.a;
            }
            jxc = (str2 == null || (str = sessionInfo.b) == null) ? b2 : b2.c(sessionInfo.a, str);
        }
        this.o = jxc;
        return jxc;
    }

    public void d(jxc jxc) {
        this.o = jxc;
        Uri a2 = jxc.a();
        wk wkVar = jxc.a;
        ((nl) this.b).setSessionInfo(new ml(wkVar.d, wkVar.e, a2 != null ? a2.toString() : null));
    }

    public void o1(Object obj, bc7 bc7, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = this.o;
                this.o = obj2;
                sk6 sk6 = (sk6) obj3;
                ((bx) this.c).k.c((sk6) obj2);
                return;
            default:
                Object obj4 = this.o;
                this.o = obj2;
                sk6 sk62 = (sk6) obj2;
                sk6 sk63 = (sk6) obj4;
                ((nl6) this.c).c.getClass();
                return;
        }
    }

    public ax() {
        this.a = 1;
        this.b = new bkb(4);
    }

    public ax(vte vte) {
        this.a = 3;
        this.b = vte;
        this.o = new r36(0, 0);
    }
}
