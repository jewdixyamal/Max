package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: pcd  reason: default package */
public final class pcd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ add Y;
    public final /* synthetic */ Uri Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pcd(add add, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
        this.Z = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pcd) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pcd pcd = new pcd(this.Y, this.Z, continuation);
        pcd.X = obj;
        return pcd;
    }

    public final Object o(Object obj) {
        Object obj2;
        Uri uri;
        e5f e5f = e5f.a;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        bc7[] bc7Arr = add.K0;
        add add = this.Y;
        je7 je7 = add.u0;
        Application application = add.X;
        File q = ((kk5) je7.getValue()).q((String) add.F0.get());
        try {
            if (!q.exists() && (uri = this.Z) != null) {
                s5c.I(application.getContentResolver().openInputStream(uri), q);
            }
            obj2 = e5f;
        } catch (Throwable th) {
            obj2 = new njc(th);
        }
        Throwable a = pjc.a(obj2);
        if (a != null) {
            hm9.p(sx3.getClass().getName(), "failed to copy picked image, e:", a);
            add.w();
        }
        z7d z7d = ((p7b) add.s()).b;
        String absolutePath = q.getAbsolutePath();
        j47.c0(z7d, absolutePath, absolutePath);
        j47.a0(((p7b) add.s()).b, q.getAbsolutePath());
        Intent intent = new Intent(application, ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        pnf.o(add.z0, new vgd(intent));
        return e5f;
    }
}
