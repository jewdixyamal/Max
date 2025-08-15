package defpackage;

import android.view.View;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;

/* renamed from: z20  reason: default package */
public final /* synthetic */ class z20 implements View.OnLongClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ z20(int i) {
        this.a = i;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                int i = AudioAttachView.w0;
                return true;
            case 1:
                int i2 = AudioListenView.B0;
                return true;
            default:
                b46 b46 = CallLinkInfoScreen.B0;
                return false;
        }
    }
}
