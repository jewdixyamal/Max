package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: je2  reason: default package */
public final class je2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaDownloadBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public je2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.Y = chatMediaDownloadBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((je2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        je2 je2 = new je2(continuation, this.Y);
        je2.X = obj;
        return je2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kn4 kn4 = (kn4) this.X;
        boolean z = kn4 instanceof jn4;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.Y;
        if (z) {
            chatMediaDownloadBottomSheet.s0(false);
            jn4 jn4 = (jn4) kn4;
            Uri uri = jn4.a;
            en4 en4 = jn4.b;
            switch (en4.ordinal()) {
                case 0:
                    if (uri != null) {
                        String str = o37.a;
                        o37.c(chatMediaDownloadBottomSheet.getContext(), uri, "video/*");
                        break;
                    }
                    break;
                case 1:
                    chatMediaDownloadBottomSheet.A0(p0c.media_share_dialog_download_video_success, woc.n);
                    break;
                case 2:
                case 4:
                    if (uri != null) {
                        String str2 = o37.a;
                        o37.c(chatMediaDownloadBottomSheet.getContext(), uri, "image/*");
                        break;
                    }
                    break;
                case 3:
                case 5:
                    chatMediaDownloadBottomSheet.A0(en4 == en4.Z ? p0c.media_share_dialog_download_gif_success : p0c.media_share_dialog_download_photo_success, woc.n);
                    break;
                case 6:
                    if (uri != null) {
                        String str3 = o37.a;
                        o37.c(chatMediaDownloadBottomSheet.getContext(), uri, "*/*");
                        break;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (kn4 instanceof in4) {
            int i = ((in4) kn4).a;
            int i2 = woc.I;
            bc7[] bc7Arr = ChatMediaDownloadBottomSheet.E0;
            chatMediaDownloadBottomSheet.A0(i, i2);
            chatMediaDownloadBottomSheet.s0(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        og4 og4 = chatMediaDownloadBottomSheet.B0;
        if (og4 != null) {
            og4.a();
        }
        return e5f.a;
    }
}
