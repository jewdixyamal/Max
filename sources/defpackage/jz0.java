package defpackage;

import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* renamed from: jz0  reason: default package */
public final /* synthetic */ class jz0 implements UnaryOperator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yz0 b;

    public /* synthetic */ jz0(boolean z, yz0 yz0) {
        this.a = z;
        this.b = yz0;
    }

    public final Object apply(Object obj) {
        boolean z;
        xs xsVar = (xs) obj;
        xsVar.getClass();
        qs qsVar = new qs(xsVar);
        while (true) {
            boolean hasNext = qsVar.hasNext();
            z = this.a;
            if (!hasNext) {
                break;
            }
            ParticipantId c = mqa.c(((Number) qsVar.next()).longValue());
            yz0 yz0 = this.b;
            if (z) {
                Conversation a2 = yz0.d().a();
                if (a2 != null) {
                    a2.promoteParticipant(c, true);
                }
            } else {
                Conversation a3 = yz0.d().a();
                if (a3 != null) {
                    a3.removeParticipant(c);
                }
            }
        }
        return z ? xsVar : new xs(0);
    }
}
