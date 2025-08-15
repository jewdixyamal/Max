package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: b32  reason: default package */
public final class b32 extends d8d implements hua {
    public final a20 X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final long o;
    public sd7 s0;

    public b32(long j, String str, long j2, a20 a20, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = a20;
        this.Y = j3;
        this.Z = b32.class.getName();
    }

    public final int c() {
        return 1;
    }

    public final void d() {
    }

    public final byte[] f() {
        Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = new Tasks.ChangeProfileOrChatPhoto();
        changeProfileOrChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeProfileOrChatPhoto.file = str;
        changeProfileOrChatPhoto.chatId = this.o;
        a20 a20 = this.X;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            changeProfileOrChatPhoto.crop = rect;
        }
        changeProfileOrChatPhoto.lastModified = this.Y;
        return qw8.toByteArray(changeProfileOrChatPhoto);
    }

    public final long getId() {
        return this.b;
    }

    public final iua getType() {
        return iua.TYPE_CHANGE_PROFILE_OR_CHAT_PHOTO;
    }

    public final int h() {
        return 1;
    }

    public final void w() {
        sd7 sd7 = this.s0;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        this.s0 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gk8, java.lang.Object] */
    public final void x() {
        ? obj = new Object();
        obj.c = this.c;
        obj.a = this.Y;
        obj.b = 4;
        d7f d7f = new d7f(obj);
        sd7 sd7 = this.s0;
        if (sd7 != null) {
            dm4.a(sd7);
        }
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        qy9 e = ((c7f) e8d.u.getValue()).e(d7f);
        hle q = q();
        q.getClass();
        r0a n = e.n(((jle) q).a());
        sd7 sd72 = new sd7(new wmc(this, false), new ey1(8, this), ft.d);
        n.a(sd72);
        this.s0 = sd72;
    }

    public /* synthetic */ b32(long j, String str, long j2, a20 a20) {
        this(j, str, j2, a20, pag.u(str));
    }
}
