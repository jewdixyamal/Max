package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: io9  reason: default package */
public final class io9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mo9 Z;
    public final /* synthetic */ Uri s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io9(mo9 mo9, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Z = mo9;
        this.s0 = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((io9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        io9 io9 = new io9(this.Z, this.s0, continuation);
        io9.Y = obj;
        return io9;
    }

    public final Object o(Object obj) {
        Object obj2;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3 = (sx3) this.Y;
            File q = ((kk5) this.Z.b.getValue()).q(this.Z.k);
            Uri uri = this.s0;
            mo9 mo9 = this.Z;
            try {
                if (!q.exists() && uri != null) {
                    s5c.I(((Context) mo9.c.getValue()).getContentResolver().openInputStream(uri), q);
                }
                obj2 = e5f;
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
            mo9 mo92 = this.Z;
            Throwable a = pjc.a(obj2);
            if (a != null) {
                hm9.p(sx3.getClass().getName(), "failed to copy picked image, e:", a);
                mo92.b();
            }
            String absolutePath = q.getAbsolutePath();
            j47.c0((y7d) this.Z.d.getValue(), absolutePath, absolutePath);
            j47.a0((y7d) this.Z.d.getValue(), q.getAbsolutePath());
            Intent intent = new Intent((Context) this.Z.c.getValue(), ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            kld kld = this.Z.g;
            dd0 dd0 = new dd0(intent);
            this.X = 1;
            if (kld.a(dd0, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
