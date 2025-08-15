package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: wg5  reason: default package */
public final class wg5 extends ol implements lme, hua {
    public final String X;
    public final long Y;
    public final String Z;
    public final long o;
    public final String s0 = wg5.class.getName();

    public wg5(String str, String str2, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = str;
        this.Y = j3;
        this.Z = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = defpackage.vx8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r4 = this;
            long r0 = r4.Y
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            au8 r4 = r4.p()
            cu8 r4 = r4.q(r0)
            if (r4 == 0) goto L_0x0018
            vx8 r0 = defpackage.vx8.DELETED
            vx8 r4 = r4.v0
            if (r4 != r0) goto L_0x001a
        L_0x0018:
            r4 = 3
            return r4
        L_0x001a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg5.c():int");
    }

    public final void d() {
        t().d(this.a);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [one, java.lang.Object] */
    public final void e(gle gle) {
        yg5 yg5 = (yg5) gle;
        String str = this.s0;
        hm9.m(str, "onSuccess %s", yg5);
        l().c(new ah5(this.a, yg5.c));
        au8 p = p();
        long j = this.Y;
        cu8 q = p.q(j);
        if (q != null && q.v0 != vx8.DELETED) {
            ? obj = new Object();
            obj.a = j;
            obj.b = this.Z;
            obj.j = this.o;
            obj.k = this.X;
            obj.g = yg5.c;
            obj.h = true;
            pne pne = new pne(obj);
            hm9.m(str, "fileAttachDownloader.downloadAttach(%s)", pne);
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            ((rf5) plVar.H.getValue()).a(pne);
        }
    }

    public final byte[] f() {
        Tasks.FileDownloadCmd fileDownloadCmd = new Tasks.FileDownloadCmd();
        fileDownloadCmd.requestId = this.a;
        fileDownloadCmd.fileId = this.o;
        fileDownloadCmd.fileName = this.X;
        fileDownloadCmd.messageId = this.Y;
        String str = this.Z;
        if (!(str == null || str.length() == 0)) {
            fileDownloadCmd.attachLocalId = str;
        }
        return qw8.toByteArray(fileDownloadCmd);
    }

    public final void g(pke pke) {
        String str;
        hm9.r(this.s0, pke.X, "fail %s", pke);
        cu8 q = p().q(this.Y);
        long j = this.a;
        if (q == null || q.v0 == vx8.DELETED || (str = this.Z) == null) {
            d();
            l().c(new oi0(j, pke));
            return;
        }
        boolean equals = "file.not.found".equals(pke.b);
        p().v(q.b, str, new l01(equals, 5));
        l().c(new l6f(q.t0, this.Y, 0));
        if (equals) {
            d();
            l().c(new oi0(j, pke));
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_FILE_DOWNLOAD_CMD;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        return new tq2(this.o, 14, (byte) 0);
    }
}
