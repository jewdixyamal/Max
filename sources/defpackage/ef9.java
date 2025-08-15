package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ef9  reason: default package */
public abstract class ef9 {
    public static ff9 a(byte[] bArr) {
        Object obj;
        try {
            Tasks.MsgReact msgReact = (Tasks.MsgReact) qw8.mergeFrom(new Tasks.MsgReact(), bArr);
            long j = msgReact.requestId;
            long j2 = msgReact.chatId;
            long j3 = msgReact.messageId;
            long j4 = msgReact.chatServerId;
            long j5 = msgReact.messageServerId;
            yb9 yb9 = gx8.b;
            int i = msgReact.reactionType;
            yb9.getClass();
            Iterator it = gx8.X.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                Iterator it2 = it;
                if (((gx8) obj).a == i) {
                    break;
                }
                it = it2;
            }
            gx8 gx8 = (gx8) obj;
            if (gx8 != null) {
                return new ff9(j, j2, j3, j4, j5, new bx8(gx8, msgReact.reaction));
            }
            throw new IllegalArgumentException(zr6.h(i, "Unknown reactionType = "));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
