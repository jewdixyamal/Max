package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: oe8  reason: default package */
public final class oe8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oe8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oe8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oe8 oe8 = new oe8(continuation, this.Y);
        oe8.X = obj;
        return oe8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof ke8) {
            MediaPickerScreen mediaPickerScreen = this.Y;
            Intent intent = new Intent(mediaPickerScreen.getContext(), ActAvatarCrop.class);
            ke8 ke8 = (ke8) wm9;
            intent.putExtra("ru.ok.tamtam.extra.URI", ke8.b);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", ke8.c);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            mediaPickerScreen.startActivityForResult(intent, 666);
        }
        return e5f.a;
    }
}
