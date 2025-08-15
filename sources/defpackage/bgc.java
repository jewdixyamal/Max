package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: bgc  reason: default package */
public final class bgc extends ol implements lme, hua {
    public final long o;

    public bgc(long j, long j2) {
        super(j);
        this.o = j2;
    }

    public final int c() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [long[], java.io.Serializable] */
    public final void d() {
        long t = ((p7b) r()).a.t();
        if (t > 0) {
            k4a k4a = (k4a) j();
            k4a.v(k4a, new oc2(((p7b) k4a.y()).a.o(), new long[]{t}, 1));
        }
        t().d(this.a);
    }

    public final void e(gle gle) {
        cgc cgc = (cgc) gle;
        pl plVar = null;
        ((p7b) r()).a.m("user.deviceAvatarPath", (String) null);
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((blb) plVar.W.getValue()).b(cgc.c);
        l().c(new dgc(this.a, cgc.c.a));
    }

    public final byte[] f() {
        Tasks.RemoveContactPhoto removeContactPhoto = new Tasks.RemoveContactPhoto();
        removeContactPhoto.requestId = this.a;
        removeContactPhoto.photoId = this.o;
        return qw8.toByteArray(removeContactPhoto);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
        l().c(new oi0(this.a, pke));
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_REMOVE_CONTACT_PHOTO;
    }

    public final dle i() {
        return new gs9(this.o);
    }
}
