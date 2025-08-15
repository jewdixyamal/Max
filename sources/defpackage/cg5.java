package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: cg5  reason: default package */
public final class cg5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dg5 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ long v0;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cg5(dg5 dg5, long j, String str, String str2, long j2, long j3, String str3, Continuation continuation) {
        super(2, continuation);
        this.Y = dg5;
        this.Z = j;
        this.s0 = str;
        this.t0 = str2;
        this.u0 = j2;
        this.v0 = j3;
        this.w0 = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cg5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cg5(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            v7g v7g = this.Y.a;
            long j = this.Z;
            String str = this.s0;
            String str2 = this.t0;
            long j2 = this.u0;
            long j3 = this.v0;
            String str3 = this.w0;
            String str4 = str2;
            String str5 = "ru.ok.tamtam.upload.workers.UploadExternalGifWorker/" + new m7f(j, j2, str, j3, str4, str3);
            qla qla = (qla) ((qla) ((qla) new qla(UploadExternalGifWorker.class).setConstraints(new kj3(2, false, false, false, false, -1, -1, x53.H0(new LinkedHashSet())))).setExpedited(jna.a)).setBackoffCriteria(mf0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
            kpa[] kpaArr = {new kpa("taskName", str5), new kpa("requestId", Long.valueOf(j)), new kpa("externalUrl", str), new kpa("attachLocalId", str4), new kpa("messageId", Long.valueOf(j2)), new kpa(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j3)), new kpa("stickerId", str3)};
            qqd qqd = new qqd(9, (byte) 0);
            for (int i2 = 0; i2 < 7; i2++) {
                kpa kpa = kpaArr[i2];
                qqd.A(kpa.b, (String) kpa.a);
            }
            mh7 b = v7g.b(str5, h65.b, (rla) ((qla) qla.setInputData(qqd.p())).build(), false);
            b.l();
            t03 t03 = new t03(new ovc(od2.f(od2.g(new uq5(b.m.q(), (Continuation) null)), -1, 2), 5), 6);
            this.X = 1;
            Object A = od2.A(t03, this);
            return A == tx3 ? tx3 : A;
        } else if (i == 1) {
            od2.a0(obj);
            return obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
