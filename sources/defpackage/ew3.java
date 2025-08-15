package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;

/* renamed from: ew3  reason: default package */
public final /* synthetic */ class ew3 implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateConfParams b;

    public /* synthetic */ ew3(CreateConfParams createConfParams, int i) {
        this.a = i;
        this.b = createConfParams;
    }

    public final void accept(Object obj) {
        int i = this.a;
        CreateConfParams createConfParams = this.b;
        switch (i) {
            case 0:
                createConfParams.getOnPrepared().invoke((Conversation) obj);
                return;
            default:
                createConfParams.getOnError().invoke((Throwable) obj);
                return;
        }
    }
}
