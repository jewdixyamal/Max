package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: x7f  reason: default package */
public final class x7f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ UploadFileAttachWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x7f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x7f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x7f(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        UploadFileAttachWorker uploadFileAttachWorker = this.Y;
        if (i == 0) {
            od2.a0(obj);
            hm9.m("UploadFileAttachWorker", "save %s", uploadFileAttachWorker.c());
            qa3 qa3 = new qa3(((py8) uploadFileAttachWorker.b.getValue()).b(), 2, new yt8(2, (Object) uploadFileAttachWorker.c()));
            this.X = 1;
            if (s36.e(qa3, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                hm9.p("UploadFileAttachWorker", "save failed!", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hm9.m("UploadFileAttachWorker", "save finish %s", uploadFileAttachWorker.c());
        return e5f.a;
    }
}
