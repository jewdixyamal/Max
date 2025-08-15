package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* renamed from: kyc  reason: default package */
public final class kyc extends ffe implements a66 {
    public j87 X;
    public int Y;
    public final /* synthetic */ j87 Z;
    public final /* synthetic */ SdkCoroutineWorker s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kyc(j87 j87, SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Z = j87;
        this.s0 = sdkCoroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kyc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kyc(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        j87 j87;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            j87 j872 = this.Z;
            this.X = j872;
            this.Y = 1;
            Object foregroundInfo = this.s0.getForegroundInfo(this);
            if (foregroundInfo == tx3) {
                return tx3;
            }
            j87 j873 = j872;
            obj = foregroundInfo;
            j87 = j873;
        } else if (i == 1) {
            j87 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j87.a.j(obj);
        return e5f.a;
    }
}
