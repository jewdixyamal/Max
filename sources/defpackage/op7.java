package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: op7  reason: default package */
public final class op7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pp7 Y;
    public final /* synthetic */ gef Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public op7(pp7 pp7, gef gef, Continuation continuation) {
        super(2, continuation);
        this.Y = pp7;
        this.Z = gef;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((op7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        op7 op7 = new op7(this.Y, this.Z, continuation);
        op7.X = obj;
        return op7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        for (Bitmap bitmap : (List) this.Y.d.getValue()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        ((MediaMetadataRetriever) this.Y.f.getValue()).setDataSource(this.Z.l().getPath());
        try {
            String extractMetadata = ((MediaMetadataRetriever) this.Y.f.getValue()).extractMetadata(9);
            this.Y.h = extractMetadata != null ? Long.parseLong(extractMetadata) : this.Z.c();
        } catch (Exception e) {
            hm9.p(this.Y.b, "Can't extract duration", e);
            this.Y.h = this.Z.c();
        }
        ArrayList arrayList = new ArrayList();
        int i = this.Y.g;
        int i2 = 0;
        while (true) {
            e5f e5f = e5f.a;
            if (i2 >= i || !j1e.z(sx3)) {
                return e5f;
            }
            long j = this.Y.h;
            pp7 pp7 = this.Y;
            long j2 = (j / ((long) pp7.g)) * ((long) i2) * 1000;
            m26 m26 = pp7.a;
            Bitmap scaledFrameAtTime = ((MediaMetadataRetriever) pp7.f.getValue()).getScaledFrameAtTime(j2, 2, m26.b, m26.c);
            if (scaledFrameAtTime != null && j1e.z(sx3)) {
                arrayList.add(scaledFrameAtTime);
                this.Y.d.m((Object) null, arrayList);
            }
            i2++;
        }
    }
}
