package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: ou8  reason: default package */
public abstract class ou8 {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(Protos.MessageElement[] messageElementArr) {
        mu8 mu8;
        mu8 mu82;
        ArrayList arrayList = new ArrayList();
        for (Protos.MessageElement messageElement : messageElementArr) {
            int i = messageElement.type;
            Map map = null;
            switch (i) {
                case 0:
                    mu82 = mu8.a;
                    break;
                case 1:
                    mu82 = mu8.b;
                    break;
                case 2:
                    mu82 = mu8.o;
                    break;
                case 3:
                    mu82 = mu8.c;
                    break;
                case 4:
                    mu82 = mu8.X;
                    break;
                case 5:
                    mu82 = mu8.Y;
                    break;
                case 6:
                    mu82 = mu8.Z;
                    break;
                case 7:
                    mu82 = mu8.t0;
                    break;
                case 8:
                    mu82 = mu8.u0;
                    break;
                case 9:
                    mu82 = mu8.s0;
                    break;
                case 10:
                    mu82 = mu8.v0;
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    hm9.p("ou8", "Unknown protoElement type = " + i, (Throwable) null);
                    mu8 = null;
                    break;
            }
            mu8 = mu82;
            long j = messageElement.entityId;
            String str = oag.t(messageElement.entityName) ? null : messageElement.entityName;
            int i2 = messageElement.from;
            int i3 = messageElement.length;
            Protos.MessageElement.LinkAttributes linkAttributes = messageElement.linkAttributes;
            if (linkAttributes != null) {
                map = Collections.singletonMap("url", linkAttributes.url);
            }
            arrayList.add(new nu8(j, str, mu8, i2, i3, map));
        }
        return arrayList;
    }

    public static byte[] b(List list) {
        return qw8.toByteArray(c(list));
    }

    public static Protos.MessageElements c(List list) {
        Protos.MessageElements messageElements = new Protos.MessageElements();
        messageElements.elements = new Protos.MessageElement[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nu8 nu8 = (nu8) list.get(i);
            Protos.MessageElement messageElement = new Protos.MessageElement();
            messageElement.entityId = nu8.a;
            byte[] bArr = b.a;
            String str = nu8.b;
            if (str == null) {
                str = "";
            }
            messageElement.entityName = str;
            messageElement.from = nu8.d;
            messageElement.length = nu8.e;
            switch (nu8.c.ordinal()) {
                case 0:
                    messageElement.type = 0;
                    break;
                case 1:
                    messageElement.type = 1;
                    break;
                case 2:
                    messageElement.type = 3;
                    break;
                case 3:
                    messageElement.type = 2;
                    break;
                case 4:
                    messageElement.type = 4;
                    break;
                case 5:
                    messageElement.type = 5;
                    Map map = nu8.f;
                    if (map.containsKey("url")) {
                        Protos.MessageElement.LinkAttributes linkAttributes = new Protos.MessageElement.LinkAttributes();
                        messageElement.linkAttributes = linkAttributes;
                        linkAttributes.url = (String) map.get("url");
                        break;
                    } else {
                        throw new IllegalStateException("There are not enough attributes for the type = LINK");
                    }
                case 6:
                    messageElement.type = 6;
                    break;
                case 7:
                    messageElement.type = 9;
                    break;
                case 8:
                    messageElement.type = 7;
                    break;
                case 9:
                    messageElement.type = 8;
                    break;
                case 10:
                    messageElement.type = 10;
                    break;
            }
            messageElements.elements[i] = messageElement;
        }
        return messageElements;
    }
}
