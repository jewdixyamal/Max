package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: j7f  reason: default package */
public final class j7f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ UploadDraftMediaWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j7f(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadDraftMediaWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j7f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j7f(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        UploadDraftMediaWorker uploadDraftMediaWorker = this.Y;
        if (i == 0) {
            od2.a0(obj);
            qa3 qa3 = new qa3(((up4) uploadDraftMediaWorker.b.getValue()).a(), 2, new gd1(9, uploadDraftMediaWorker.d()));
            this.X = 1;
            if (s36.e(qa3, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                hm9.p("UploadDraftMediaWorker", "storeDraftUpload: failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lp4 d = uploadDraftMediaWorker.d();
        hm9.m("UploadDraftMediaWorker", "storeDraftUpload: finish store upload = " + d, new Object[0]);
        return e5f.a;
    }
}
