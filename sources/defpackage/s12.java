package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: s12  reason: default package */
public final class s12 extends d8d implements hua {
    public final a20 X;
    public final long Y;
    public final String Z = s12.class.getName();
    public final long b;
    public final String c;
    public final long o;
    public hc3 s0;

    public s12(long j, String str, long j2, a20 a20, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = a20;
        this.Y = j3;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        s().d(this.b);
        y();
    }

    public final byte[] f() {
        Tasks.ChangeChatPhoto changeChatPhoto = new Tasks.ChangeChatPhoto();
        changeChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeChatPhoto.file = str;
        changeChatPhoto.chatId = this.o;
        a20 a20 = this.X;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            changeChatPhoto.crop = rect;
        }
        changeChatPhoto.lastModified = this.Y;
        return qw8.toByteArray(changeChatPhoto);
    }

    public final long getId() {
        return this.b;
    }

    public final iua getType() {
        return iua.TYPE_CHANGE_CHAT_PHOTO;
    }

    public final void w() {
        y();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gk8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [hc3, java.lang.Object] */
    public final void x() {
        ? obj = new Object();
        obj.c = this.c;
        obj.a = this.Y;
        obj.b = 4;
        d7f d7f = new d7f(obj);
        y();
        this.s0 = new Object();
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        qy9 e = ((c7f) e8d.u.getValue()).e(d7f);
        hle q = q();
        q.getClass();
        r0a n = e.n(((jle) q).a());
        sd7 sd7 = new sd7(new rxd(8, this), new o9g(8, (Object) this), ft.d);
        n.a(sd7);
        hc3 hc3 = this.s0;
        if (hc3 != null) {
            hc3.a(sd7);
        }
    }

    public final void y() {
        hc3 hc3 = this.s0;
        if (hc3 != null) {
            hc3.g();
        }
        this.s0 = null;
    }

    public final void z() {
        p82 b2 = b();
        long j = this.o;
        e52 C = b2.C(j);
        if (C != null) {
            b().W(j, v82.b);
            ((k4a) a()).j(C.b.a);
        }
    }
}
