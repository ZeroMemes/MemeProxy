/*
 * This file is part of MemeProxy.
 *
 * MemeProxy is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MemeProxy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MemeProxy.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.zero.memeproxy.interfaces;

import io.netty.buffer.ByteBuf;

import java.util.Queue;

/**
 * @author Brady
 * @since 8/13/2018
 */
public interface Interceptor {

    boolean clientToServer(ByteBuf msg);

    boolean serverToClient(ByteBuf msg);

    Queue<ByteBuf> getClientSendQueue();

    Queue<ByteBuf> getServerSendQueue();
}
