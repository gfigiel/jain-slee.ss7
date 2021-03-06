/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.map;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;

import javax.slee.resource.ActivityHandle;
import javax.slee.resource.FireableEventType;
import javax.slee.resource.Marshaler;

/**
 * @author Tomasz Domin Tomasz.Domin@arevocom.com
 */
public class MAPRAMarshaler implements Marshaler {

	// Events -----------------------------------------------------------------
	
	public int getEstimatedEventSize(FireableEventType eventType, Object event) {
		// TODO: return an estimation of the size (in bytes) of the marshaled
		//       form of an Event object generated by the Resource Adaptor. It
		//       can be used by the SLEE to help size appropriately any 
		//       internal buffers used to store the marshaled form of an Event.

		throw new UnsupportedOperationException();
	}

	public ByteBuffer getEventBuffer(FireableEventType eventType, Object event) {
		// TODO: return a ByteBuffer containing an already marshaled form of
		//       the Event object specified by the event argument. The 
		//       eventType argument specifies the event type of the Event. The
		//       exact purpose of this method is to give the Resource Adaptor
		//       an opportunity to provide the SLEE with a view buffer onto an
		//       existing buffer that already contains the marshaled form of
		//       the Event object.

		throw new UnsupportedOperationException();
	}

	public void releaseEventBuffer(FireableEventType eventType, Object event, ByteBuffer buffer) {
		// TODO: release any resources associated with the specified ByteBuffer
		//       when this method is invoked as the SLEE will no longer use the
		//       buffer.

		throw new UnsupportedOperationException();
	}

	public void marshalEvent(FireableEventType eventType, Object event, DataOutput out) throws IOException {
		// TODO: return the marshaled form of an Event object. The Resource 
		//       Adaptor should write a serialized form of the Event object 
		//       specified by the event argument using the DataOutput object
		//       specified by the out argument. The eventType argument 
		//       identifies the event type of the Event object. 

		throw new UnsupportedOperationException();
	}

	public Object unmarshalEvent(FireableEventType eventType, DataInput in) throws IOException {
		// TODO: read the marshaled form of the Event object from the DataInput
		//       object specified by the in argument and reconstruct the Event 
		//       object. The eventType argument identifies the event type of 
		//       the Event object that is marshaled and provides access to the
		//       class name of the event type and a class loader that can be 
		//       used to load the event class if required. 

		throw new UnsupportedOperationException();
	}
	
	// Activity Handles -------------------------------------------------------	

	public int getEstimatedHandleSize(ActivityHandle handle) {
		// TODO: return an estimation of the size (in bytes) of the marshaled
		//       form of an Activity Handle object generated by the Resource 
		//       Adaptor. It can be used by the SLEE to help size appropriately
		//       any internal buffers used to store the marshaled form of an
		//       Activity Handle.

		throw new UnsupportedOperationException();
	}

	public void marshalHandle(ActivityHandle handle, DataOutput out) throws IOException {
		// TODO: return the marshaled form of an ActivityHandle object. The
		//       Resource Adaptor should write a serialized form of the 
		//       ActivityHandle object specified by the handle argument using
		//       the DataOutput object specified by the out argument.

		throw new UnsupportedOperationException();
	}

	public ActivityHandle unmarshalHandle(DataInput in) throws IOException {
		// TODO: return an unmarshaled ActivityHandle object previously
		//       marshaled by the Resource Adaptor. The Resource Adaptor should
		//       read the marshaled form of the Activity Handle from the 
		//       DataInput object specified by the in argument and reconstruct
		//       the ActivityHandle object.

		throw new UnsupportedOperationException();
	}

}
