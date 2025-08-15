package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ue9  reason: default package */
public abstract class ue9 {
    public static ve9 a(byte[] bArr) {
        try {
            Tasks.MsgEdit msgEdit = (Tasks.MsgEdit) qw8.mergeFrom(new Tasks.MsgEdit(), bArr);
            Protos.Attaches attaches = msgEdit.oldAttaches;
            ArrayList arrayList = null;
            List list = attaches != null ? (List) b.e(attaches).a : null;
            Protos.MessageElements messageElements = msgEdit.oldElements;
            if (messageElements != null) {
                arrayList = ou8.a(messageElements.elements);
            }
            ArrayList arrayList2 = arrayList;
            long j = msgEdit.requestId;
            long j2 = msgEdit.chatId;
            long j3 = msgEdit.messageId;
            long j4 = msgEdit.chatServerId;
            long j5 = msgEdit.messageServerId;
            String str = msgEdit.text;
            String str2 = msgEdit.oldText;
            int i = msgEdit.oldStatus;
            vx8[] values = vx8.values();
            String str3 = str2;
            int length = values.length;
            String str4 = str;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                vx8 vx8 = values[i2];
                vx8[] vx8Arr = values;
                if (vx8.a == i) {
                    return new ve9(j, j2, j3, j4, j5, str4, str3, vx8, list, arrayList2, msgEdit.editAttaches);
                }
                i2++;
                length = i3;
                values = vx8Arr;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
