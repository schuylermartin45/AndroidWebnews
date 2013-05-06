/**
See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  This code is licensed
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/

package edu.rit.csh.androidwebnews;

/**
 * This is used to handle when there is no internet for the phone
 * @author JD
 */
public class NoInternetException extends Exception {
	
	public NoInternetException() {
		
	}
	
	public NoInternetException(String message) {
		super(message);
	}
}