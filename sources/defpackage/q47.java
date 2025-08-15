package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: q47  reason: default package */
public final class q47 extends wp3 implements hua {
    public static final /* synthetic */ int t0 = 0;
    public final String Z;
    public final pne s0;

    public q47(long j, String str, long j2, long j3, pne pne) {
        super(1, j, j2, Collections.singletonList(Long.valueOf(j3)));
        this.Z = str;
        this.s0 = pne;
    }

    public final int c() {
        au8 p = p();
        pne pne = this.s0;
        cu8 q = p.q(pne.a);
        if (q != null && q.v0 != vx8.DELETED && q.u()) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("onPreExecute: messageId ");
        long j = pne.a;
        sb.append(j);
        sb.append(" is wrong");
        hm9.m("q47", sb.toString(), new Object[0]);
        w(q);
        l().c(new to4(j));
        return 3;
    }

    public final void d() {
        hm9.m("q47", "onMaxFailCount", new Object[0]);
        t().d(this.a);
        au8 p = p();
        pne pne = this.s0;
        w(p.q(pne.a));
        l().c(new to4(pne.a));
    }

    public final byte[] f() {
        Tasks.FileDownload fileDownload = new Tasks.FileDownload();
        pne pne = this.s0;
        fileDownload.messageId = pne.a;
        fileDownload.attachId = pne.b;
        fileDownload.videoId = pne.c;
        fileDownload.audioId = pne.d;
        fileDownload.mp4GifId = pne.e;
        fileDownload.stickerId = pne.f;
        fileDownload.fileId = pne.j;
        fileDownload.fileName = pne.k;
        fileDownload.url = pne.g;
        fileDownload.notifyProgress = pne.h;
        fileDownload.checkAutoloadConnection = pne.i;
        fileDownload.invalidateCount = pne.l;
        fileDownload.useOriginalExtension = pne.m;
        fileDownload.notCopyVideoToGallery = pne.n;
        Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = new Tasks.InvalidateAndDownloadAudio();
        invalidateAndDownloadAudio.requestId = this.a;
        invalidateAndDownloadAudio.outputPath = this.Z;
        invalidateAndDownloadAudio.chatServerId = this.X;
        invalidateAndDownloadAudio.serverMessageId = ((Number) ((List) this.Y).get(0)).longValue();
        invalidateAndDownloadAudio.fileDownload = fileDownload;
        return qw8.toByteArray(invalidateAndDownloadAudio);
    }

    public final void g(pke pke) {
        super.g(pke);
        if (!f46.U(pke.b)) {
            hm9.p("q47", "Can't update msg", (Throwable) null);
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_INVALIDATE_AND_DOWNLOAD_AUDIO;
    }

    public final int h() {
        return 1000000;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [one, java.lang.Object] */
    /* renamed from: u */
    public final void e(xe9 xe9) {
        String str;
        super.u(xe9);
        hm9.m("q47", "Receive msg get response", new Object[0]);
        au8 p = p();
        pne pne = this.s0;
        cu8 q = p.q(pne.a);
        pl plVar = null;
        if (q == null || !q.u()) {
            hm9.p("q47", "No message after msg get", (Throwable) null);
            d();
            return;
        }
        cu8 cu8 = q.p() ? q.C0 : null;
        hm9.m("q47", "messageDb = " + q + ", forwardLink = " + cu8, new Object[0]);
        i10 c = q.c();
        if (c != null && (str = c.b) != null) {
            ? obj = new Object();
            obj.a = pne.a;
            obj.b = pne.b;
            obj.c = pne.c;
            obj.d = pne.d;
            obj.e = pne.e;
            obj.f = pne.f;
            obj.j = pne.j;
            obj.k = pne.k;
            obj.h = pne.h;
            obj.i = pne.i;
            obj.m = pne.m;
            obj.n = pne.n;
            obj.l = pne.l + 1;
            obj.g = str;
            pne pne2 = new pne(obj);
            pl plVar2 = this.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            ((rf5) plVar.H.getValue()).a(pne2);
        }
    }

    public final void w(cu8 cu8) {
        if (cu8 != null && cu8.v0 != vx8.DELETED) {
            pne pne = this.s0;
            l20 A = s5c.A(cu8, pne.b);
            if (A == null) {
                return;
            }
            if (A.o.a()) {
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((gq6) plVar.G.getValue()).a.a(new File(this.Z), pne.b);
                return;
            }
            p().v(cu8.b, A.r, new ig5(26));
            l().c(new l6f(cu8.t0, cu8.b, 0));
        }
    }
}
