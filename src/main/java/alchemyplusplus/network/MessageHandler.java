package alchemyplusplus.network;

import alchemyplusplus.AlchemyPlusPlus;
import alchemyplusplus.network.message.DiffuserUpdateMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class MessageHandler implements IMessageHandler
{

    public static SimpleNetworkWrapper INSTANCE = new SimpleNetworkWrapper(AlchemyPlusPlus.ID);

    public static void init()
    {
        int packetID = 0;
        INSTANCE.registerMessage(DiffuserUpdateMessage.class, DiffuserUpdateMessage.class, packetID++, Side.SERVER);
    }

    @Override
    public IMessage onMessage(IMessage message, MessageContext ctx)
    {
        return null;
    }
}
