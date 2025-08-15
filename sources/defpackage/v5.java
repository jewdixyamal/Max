package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.settings.FrgMediaSettings;

/* renamed from: v5  reason: default package */
public final /* synthetic */ class v5 implements sj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                jtc jtc = (jtc) obj;
                int i = ActLocalMedias.s1;
                ActLocalMedias actLocalMedias = (ActLocalMedias) obj2;
                actLocalMedias.getClass();
                actLocalMedias.q0(new ng4(jtc.a.b(), jtc.b));
                return;
            case 1:
                jtc jtc2 = (jtc) obj;
                int i2 = ActPhotoEditor.Z0;
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) obj2;
                actPhotoEditor.getClass();
                actPhotoEditor.k0(new ng4(jtc2.a.b(), jtc2.b));
                return;
            case 2:
                Collection collection = (Collection) obj;
                ix ixVar = (ix) obj2;
                hm9.m(ixVar.b, zr6.h(collection.size(), "ValidateMessagesTimeUseCase find some items for delete, count = "), new Object[0]);
                j47.T((ContextScope) ixVar.g, (lx3) null, (vx3) null, new hx(ixVar, collection, (Continuation) null), 3);
                return;
            case 3:
                xdf xdf = (xdf) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                jp jpVar = frgMediaSettings.E1;
                jpVar.getClass();
                jpVar.m("app.media.video.compress", xdf.name());
                frgMediaSettings.G1.d(xdf.ordinal(), "VIDEO_COMPRESSION_MODE_SELECTED");
                frgMediaSettings.v1();
                return;
            case 4:
                ((View) obj2).getWindowVisibleDisplayFrame((Rect) obj);
                return;
            default:
                ((ArrayList) obj2).addAll((List) obj);
                return;
        }
    }
}
