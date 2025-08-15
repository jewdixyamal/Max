package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.transformer.ExportException;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: z65  reason: default package */
public final class z65 implements n3b {
    public final wt a;
    public final /* synthetic */ go9 b;

    public z65(go9 go9, wt wtVar) {
        this.b = go9;
        this.a = wtVar;
    }

    public final void X(p0f p0f) {
        wt wtVar = this.a;
        try {
            int b2 = p0f.b(1);
            if (p0f.b(2)) {
                b2++;
            }
            if (b2 > 0) {
                wtVar.b(b2);
                ((u75) this.b.c).play();
                return;
            }
            wtVar.d(ExportException.a(new IllegalStateException("The asset loader has no track to output."), MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
        } catch (RuntimeException e) {
            wtVar.d(ExportException.a(e, 1000));
        }
    }

    public final void f0(mue mue, int i) {
        int i2;
        wt wtVar = this.a;
        go9 go9 = this.b;
        try {
            if (go9.b == 1) {
                kue kue = new kue();
                mue.o(0, kue);
                if (!kue.k) {
                    long j = kue.m;
                    if (j > 0) {
                        if (j != -9223372036854775807L) {
                            i2 = 2;
                            go9.b = i2;
                            wtVar.f(j);
                        }
                    }
                    i2 = 3;
                    go9.b = i2;
                    wtVar.f(j);
                }
            }
        } catch (RuntimeException e) {
            wtVar.d(ExportException.a(e, 1000));
        }
    }

    public final void x0(PlaybackException playbackException) {
        int i = 1000;
        Object obj = ExportException.b.get(playbackException.b());
        if (obj != null) {
            i = obj;
        }
        this.a.d(ExportException.a(playbackException, ((Integer) i).intValue()));
    }
}
