package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: w7f  reason: default package */
public final class w7f extends ffe implements a66 {
    public final /* synthetic */ UploadFileAttachWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w7f(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.X = uploadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w7f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w7f(this.X, continuation);
    }

    public final Object o(Object obj) {
        long j;
        od2.a0(obj);
        try {
            j = new File(this.X.c().b).length() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        } catch (Throwable th) {
            hm9.p("UploadFileAttachWorker", "fileSize fail!", th);
            j = 0;
        }
        return new Long(j);
    }
}
