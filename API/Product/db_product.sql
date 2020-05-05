-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 05, 2020 at 09:54 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_product`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(222) NOT NULL,
  `name` varchar(225) NOT NULL,
  `description` varchar(222) NOT NULL,
  `price` varchar(222) NOT NULL,
  `category_id` varchar(222) NOT NULL,
  `created` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `modified` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `description`, `price`, `category_id`, `created`, `modified`) VALUES
(7, 'Lenovo Laptop', 'My business partner.', '399', '2', '2014-05-31 18:13:45', '2014-05-31 02:13:39'),
(61, 'Amazing Pillow 3.0', 'The best pillow for amazing programmers.', '199', '2', '2020-04-30 06:07:54', '2020-04-30 18:07:54'),
(63, 'Roma', 'Makanan', '1999', '-1', '2020-05-05 02:06:46', '2020-05-05 14:06:46'),
(66, 'Frutang 2.0', 'Minuman', '20000', '-1', '2020-05-05 07:40:57', '2020-05-05 14:40:37'),
(67, 'Marjan Kelapa', 'Minuman', '20000', '-1', '2020-05-05 07:42:18', '2020-05-05 14:41:35'),
(68, 'Teh Sisri', 'Minuman', '500', '-1', '2020-05-05 02:47:07', '2020-05-05 14:47:07');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(222) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
