package defpackage;

import java.util.Collections;
import java.util.Map;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: yjf  reason: default package */
public final class yjf extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String s0;
    public final boolean t0;
    public final boolean u0;
    public final String v0;
    public final boolean w0;
    public final String x0 = yjf.class.getName();
    public final khe y0 = new khe(new rzd(13, this));

    public yjf(long j, long j2, long j3, long j4, long j5, String str, boolean z, boolean z2, String str2, boolean z3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = str;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = str2;
        this.w0 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = defpackage.vx8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r4 = this;
            long r0 = r4.Z
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjf.c():int");
    }

    public final void d() {
        t().d(this.a);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [one, java.lang.Object] */
    public final void e(gle gle) {
        zjf zjf = (zjf) gle;
        if (this.t0) {
            Map map = zjf.c;
            int i = f46.f;
            if (map.size() != 1 || !map.containsKey("EXTERNAL")) {
                ? obj = new Object();
                obj.a = this.Z;
                obj.b = this.s0;
                obj.c = this.o;
                obj.g = f46.H(zjf.c);
                obj.h = true;
                obj.n = !this.u0;
                pne pne = new pne(obj);
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((rf5) plVar.H.getValue()).a(pne);
                return;
            }
            return;
        }
        l().c(new akf(this.a, this.o, this.Z, this.s0, zjf.c));
    }

    public final byte[] f() {
        Tasks.VideoPlay videoPlay = new Tasks.VideoPlay();
        videoPlay.requestId = this.a;
        videoPlay.videoId = this.o;
        videoPlay.chatServerId = this.X;
        videoPlay.messageServerId = this.Y;
        videoPlay.messageId = this.Z;
        String str = this.s0;
        if (str != null) {
            videoPlay.attachLocalId = str;
        }
        videoPlay.startDownload = this.t0;
        videoPlay.saveToGallery = this.u0;
        videoPlay.token = this.v0;
        return qw8.toByteArray(videoPlay);
    }

    public final void g(pke pke) {
        cu8 q = p().q(this.Z);
        if (q == null || q.v0 == vx8.DELETED) {
            l().c(new oi0(this.a, pke));
            d();
            return;
        }
        if ("attachment.token.expired".equals(pke.b)) {
            hm9.p(this.x0, "videoPlayCmd failed with token expired, retry videoPlayCmd", (Throwable) null);
            if (this.w0) {
                l().c(new oi0(this.a, pke));
            } else {
                bkf bkf = (bkf) this.y0.getValue();
                synchronized (bkf) {
                    if (bkf.b == -1) {
                        bkf.a.l().d(bkf);
                        pk j = bkf.a.j();
                        yjf yjf = bkf.a;
                        bkf.b = ((k4a) j).D(yjf.X, Collections.singletonList(Long.valueOf(yjf.Y)));
                    }
                }
            }
        } else if ("video.not.found".equals(pke.b)) {
            hm9.p(this.x0, "videoPlayCmd failed, set attach status to ERROR", (Throwable) null);
            p().v(this.Z, this.s0, new n2f(22));
            l().c(new l6f(q.t0, q.b, 0));
        }
        if (!f46.U(pke.b)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_VIDEO_PLAY;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        return new gs9(this.v0, this.o, this.X, this.Y);
    }
}
