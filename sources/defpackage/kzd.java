package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: kzd  reason: default package */
public final class kzd extends ffe implements a66 {
    public final /* synthetic */ a X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kzd(a aVar, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.X = aVar;
        this.Y = uri;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kzd) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kzd(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int i = ActAvatarCrop.d1;
        a aVar = this.X;
        if (aVar.b0() != null) {
            Intent intent = new Intent(aVar.b0(), ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", this.Y);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", this.Z);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", false);
            intent.addFlags(65536);
            intent.putExtra("ru.ok.tamtam.extra.NO_ANIM ", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", true);
            aVar.d1(intent, 666, (Bundle) null);
        }
        return e5f.a;
    }
}
