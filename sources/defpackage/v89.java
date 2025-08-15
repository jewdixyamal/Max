package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: v89  reason: default package */
public final class v89 {
    public final je7 a;

    public v89(je7 je7) {
        this.a = je7;
    }

    public static List a(byte[] bArr) {
        try {
            Protos.MessageElements messageElements = new Protos.MessageElements();
            qw8.mergeFrom(messageElements, bArr);
            return ou8.a(messageElements.elements);
        } catch (InvalidProtocolBufferNanoException e) {
            hm9.p("MessagesTypeConverters", "InvalidProtocolBufferNanoException", e);
            return nz4.a;
        }
    }

    public static vx8 b(int i) {
        for (vx8 vx8 : vx8.values()) {
            if (vx8.a == i) {
                return vx8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static byte[] d(ix8 ix8) {
        if (ix8 == null) {
            return null;
        }
        byte[] bArr = b.a;
        Protos.MessageReactions messageReactions = new Protos.MessageReactions();
        List list = ix8.a;
        int size = list.size();
        Protos.MessageReactionWithCount[] messageReactionWithCountArr = new Protos.MessageReactionWithCount[size];
        for (int i = 0; i < size; i++) {
            hx8 hx8 = (hx8) list.get(i);
            Protos.MessageReactionWithCount messageReactionWithCount = new Protos.MessageReactionWithCount();
            Protos.ReactionData reactionData = new Protos.ReactionData();
            reactionData.reaction = hx8.a.b.a.toString();
            reactionData.type = hx8.a.a.a;
            messageReactionWithCount.count = hx8.b;
            messageReactionWithCount.reaction = reactionData;
            messageReactionWithCountArr[i] = messageReactionWithCount;
        }
        messageReactions.reactions = messageReactionWithCountArr;
        messageReactions.totalCount = ix8.b;
        c6c c6c = ix8.c;
        if (c6c != null) {
            Protos.ReactionData reactionData2 = new Protos.ReactionData();
            reactionData2.reaction = c6c.b.a.toString();
            reactionData2.type = c6c.a.a;
            messageReactions.yourReaction = reactionData2;
        }
        return qw8.toByteArray(messageReactions);
    }

    public final ix8 c(byte[] bArr) {
        jx8 jx8 = (jx8) this.a.getValue();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return jx8.a(bArr);
        } catch (ProtoException e) {
            throw new RuntimeException(e);
        }
    }
}
