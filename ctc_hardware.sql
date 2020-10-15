-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 13, 2020 at 09:53 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ctc_hardware`
--

-- --------------------------------------------------------

--
-- Table structure for table `asset_condition`
--

CREATE TABLE `asset_condition` (
  `condition_id` int(11) NOT NULL,
  `condition_name` varchar(25) NOT NULL,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asset_condition`
--

INSERT INTO `asset_condition` (`condition_id`, `condition_name`, `created_date`, `created_user_id`, `is_active`) VALUES
(1, 'Working', '2020-08-21 00:00:00', 1, 1),
(2, 'Not Working', '2020-08-21 00:00:00', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `asset_master`
--

CREATE TABLE `asset_master` (
  `rec_id` int(11) NOT NULL,
  `asset_no` int(13) DEFAULT NULL,
  `serial_no` varchar(25) NOT NULL,
  `ref_no` varchar(25) DEFAULT NULL,
  `item_id` int(11) NOT NULL,
  `purchase_date` date NOT NULL,
  `vendor_id` int(4) NOT NULL,
  `warranty_period` decimal(10,0) NOT NULL,
  `warranty_end_date` date NOT NULL,
  `grn_location_id` int(4) NOT NULL,
  `note` text,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asset_master`
--

INSERT INTO `asset_master` (`rec_id`, `asset_no`, `serial_no`, `ref_no`, `item_id`, `purchase_date`, `vendor_id`, `warranty_period`, `warranty_end_date`, `grn_location_id`, `note`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 1151101311, 'PC0QZM4T', 'DT387503', 1, '2020-08-26', 1, '0', '2020-08-26', 1, 'test', '2020-08-26', 1, '2020-08-26', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `asset_transaction`
--

CREATE TABLE `asset_transaction` (
  `transaction_id` int(11) NOT NULL,
  `transaction_type_id` int(4) NOT NULL,
  `asset_id` int(4) NOT NULL,
  `current_location_id` int(4) NOT NULL,
  `current_user_id` int(4) NOT NULL,
  `current_condition_id` int(4) NOT NULL,
  `note` text NOT NULL,
  `transaction_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `transaction_user` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `asset_user`
--

CREATE TABLE `asset_user` (
  `user_id` int(11) NOT NULL,
  `ref_no` int(13) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `email_address` varchar(100) NOT NULL,
  `phone_no` varchar(28) NOT NULL,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asset_user`
--

INSERT INTO `asset_user` (`user_id`, `ref_no`, `user_name`, `email_address`, `phone_no`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 81273635, 'Madushanka Dissanayaka', 'madushanka_dissanayaka@bat.com', '0712602972', '2020-08-25', 1, '2020-08-25', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `brand_id` int(11) NOT NULL,
  `brand_name` varchar(100) NOT NULL,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`brand_id`, `brand_name`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 'Unbranded', '2020-08-06', 1, '2020-08-18', 1, 1),
(2, 'hp', '2020-08-06', 1, '2020-08-18', 1, 1),
(3, 'Prolink', '2020-08-06', 1, '2020-08-18', 1, 1),
(4, 'Cisco', '2020-08-06', 1, '2020-08-18', 1, 1),
(5, 'Lenovo', '2020-08-06', 1, '2020-08-18', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_name`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 'Desktop PC', '2020-08-06', 1, '2020-08-19', 1, 1),
(2, 'Laptop PC', '2020-08-06', 1, '2020-08-19', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `item_master`
--

CREATE TABLE `item_master` (
  `item_id` int(11) NOT NULL,
  `category_id` int(4) NOT NULL,
  `brand_id` int(4) NOT NULL,
  `name_and_model` varchar(100) NOT NULL,
  `created_date` datetime NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_master`
--

INSERT INTO `item_master` (`item_id`, `category_id`, `brand_id`, `name_and_model`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 1, 5, 'Think Center M910 ', '2020-08-07 00:00:00', 1, '2020-08-06 06:47:02', 1, 1),
(2, 2, 5, 'Think Pad T470', '2020-08-07 00:00:00', 1, '2020-08-06 06:48:04', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `location_id` int(11) NOT NULL,
  `location_name` varchar(25) NOT NULL,
  `main_location_id` int(4) NOT NULL,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`location_id`, `location_name`, `main_location_id`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 'Kandy - Central', 1, '2020-08-13', 1, '2020-08-18', 1, 1),
(2, 'Buttala', 1, '2020-08-13', 1, '2020-08-18', 1, 1),
(3, 'Galewela', 1, '2020-08-18', 1, '2020-08-18', 1, 1),
(4, 'Haliela', 1, '2020-08-18', 1, '2020-08-18', 1, 1),
(5, 'Mahiyangana', 1, '2020-08-18', 1, '2020-10-13', 1, 0),
(6, 'Polonnaruwa', 1, '2020-08-18', 1, '2020-08-18', 1, 0),
(7, 'Teldeniya', 1, '2020-08-18', 1, '2020-08-18', 1, 0),
(8, 'Udadumbara', 1, '2020-08-18', 1, '2020-08-18', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `login_id` int(11) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `login_as` varchar(13) NOT NULL,
  `is_active` tinyint(1) NOT NULL,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`login_id`, `user_name`, `password`, `full_name`, `login_as`, `is_active`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`) VALUES
(1, 'admin', 'admin', 'Builtin Administrator ', 'admin', 1, '2020-07-27', 1, '2020-08-26', 1),
(2, 'user', 'user', 'Test User', 'user', 1, '2020-07-27', 1, '2020-08-26', 1),
(3, 'admin1', 'admin1', 'Builtin Administrator1 ', 'admin', 1, '2020-08-06', 1, '2020-08-26', 1),
(4, 'madushanka', 'admin1', 'Builtin Administrator1 ', 'admin', 1, '2020-08-06', 1, '2020-08-26', 1);

-- --------------------------------------------------------

--
-- Table structure for table `login_menu_access`
--

CREATE TABLE `login_menu_access` (
  `log_id` int(11) NOT NULL,
  `menu_item_1` tinyint(1) NOT NULL,
  `menu_item_2` tinyint(1) NOT NULL,
  `menu_item_3` tinyint(1) NOT NULL,
  `menu_item_4` tinyint(1) NOT NULL,
  `menu_item_5` tinyint(1) NOT NULL,
  `menu_item_6` tinyint(1) NOT NULL,
  `menu_item_7` tinyint(1) NOT NULL,
  `menu_item_8` tinyint(1) NOT NULL,
  `menu_item_9` tinyint(1) NOT NULL,
  `menu_item_10` tinyint(1) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_menu_access`
--

INSERT INTO `login_menu_access` (`log_id`, `menu_item_1`, `menu_item_2`, `menu_item_3`, `menu_item_4`, `menu_item_5`, `menu_item_6`, `menu_item_7`, `menu_item_8`, `menu_item_9`, `menu_item_10`, `last_modified_date`, `last_modified_user_id`) VALUES
(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '2020-08-26', 1),
(2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '2020-08-26', 1),
(3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '2020-08-26', 1),
(4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '2020-08-26', 1);

-- --------------------------------------------------------

--
-- Table structure for table `menu_index`
--

CREATE TABLE `menu_index` (
  `menu_id` int(11) NOT NULL,
  `menu_item_name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu_index`
--

INSERT INTO `menu_index` (`menu_id`, `menu_item_name`) VALUES
(2, 'Asset Master'),
(1, 'Dashboard'),
(5, 'Item Brand'),
(4, 'Item Master'),
(6, 'Item Type'),
(8, 'Location Master'),
(10, 'Settings'),
(3, 'Transaction'),
(7, 'User Master'),
(9, 'Vendor Master');

-- --------------------------------------------------------

--
-- Table structure for table `transaction_type`
--

CREATE TABLE `transaction_type` (
  `transaction_type_id` int(11) NOT NULL,
  `transaction_type_name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction_type`
--

INSERT INTO `transaction_type` (`transaction_type_id`, `transaction_type_name`) VALUES
(1, 'Change Location'),
(2, 'Change User');

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE `vendor` (
  `vendor_id` int(11) NOT NULL,
  `vendor_name` varchar(50) NOT NULL,
  `phone_no` varchar(28) NOT NULL,
  `email` varchar(50) NOT NULL,
  `created_date` date NOT NULL,
  `created_user_id` int(4) NOT NULL,
  `last_modified_date` date NOT NULL,
  `last_modified_user_id` int(4) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`vendor_id`, `vendor_name`, `phone_no`, `email`, `created_date`, `created_user_id`, `last_modified_date`, `last_modified_user_id`, `is_active`) VALUES
(1, 'Test Vendor', '1234567890', 'test@test.com', '2020-08-25', 1, '2020-08-25', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `asset_condition`
--
ALTER TABLE `asset_condition`
  ADD PRIMARY KEY (`condition_id`),
  ADD UNIQUE KEY `condition_name` (`condition_name`);

--
-- Indexes for table `asset_master`
--
ALTER TABLE `asset_master`
  ADD PRIMARY KEY (`rec_id`),
  ADD UNIQUE KEY `serial_no` (`serial_no`),
  ADD UNIQUE KEY `ref_no` (`ref_no`),
  ADD UNIQUE KEY `asset_no` (`asset_no`);

--
-- Indexes for table `asset_transaction`
--
ALTER TABLE `asset_transaction`
  ADD PRIMARY KEY (`transaction_id`);

--
-- Indexes for table `asset_user`
--
ALTER TABLE `asset_user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `ref_no` (`ref_no`),
  ADD UNIQUE KEY `email_address` (`email_address`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`brand_id`),
  ADD UNIQUE KEY `brand_name` (`brand_name`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`),
  ADD UNIQUE KEY `category_name` (`category_name`);

--
-- Indexes for table `item_master`
--
ALTER TABLE `item_master`
  ADD PRIMARY KEY (`item_id`),
  ADD UNIQUE KEY `name_and_model` (`name_and_model`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`location_id`),
  ADD UNIQUE KEY `location_name` (`location_name`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`login_id`) USING BTREE,
  ADD UNIQUE KEY `user_name` (`user_name`);

--
-- Indexes for table `login_menu_access`
--
ALTER TABLE `login_menu_access`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `menu_index`
--
ALTER TABLE `menu_index`
  ADD PRIMARY KEY (`menu_id`),
  ADD UNIQUE KEY `menu_item_name` (`menu_item_name`);

--
-- Indexes for table `transaction_type`
--
ALTER TABLE `transaction_type`
  ADD PRIMARY KEY (`transaction_type_id`),
  ADD UNIQUE KEY `transaction_type_name` (`transaction_type_name`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
  ADD PRIMARY KEY (`vendor_id`),
  ADD UNIQUE KEY `vendor_name` (`vendor_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `asset_condition`
--
ALTER TABLE `asset_condition`
  MODIFY `condition_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `asset_master`
--
ALTER TABLE `asset_master`
  MODIFY `rec_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `asset_transaction`
--
ALTER TABLE `asset_transaction`
  MODIFY `transaction_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `asset_user`
--
ALTER TABLE `asset_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `brand_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `item_master`
--
ALTER TABLE `item_master`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `location_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `login_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `transaction_type`
--
ALTER TABLE `transaction_type`
  MODIFY `transaction_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
  MODIFY `vendor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
